package com.example.product.service;

import com.example.product.api.request.ProductRequest;
import com.example.product.api.request.UpdateProductRequest;
import com.example.product.api.response.ProductResponse;
import com.example.product.domain.Product;
import com.example.product.repository.ProductRepository;
import com.example.product.support.ProductMapper;
import com.example.product.support.exception.ProductExceptionSupplier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repository;
    private final ProductMapper mapper;
    private final ProductExceptionSupplier exceptions;

    public ProductService(ProductRepository repository, ProductMapper mapper, ProductExceptionSupplier exceptions) {
        this.repository = repository;
        this.mapper = mapper;
        this.exceptions = exceptions;
    }

    public ProductResponse create(ProductRequest request) {
        Product product = mapper.toProduct(request);
        Product saved = repository.save(product);
        return mapper.toResponse(saved);
    }

    public ProductResponse find(Long id) {
        Product product = repository.findById(id).orElseThrow(exceptions.productNotFound(id));
        return mapper.toResponse(product);
    }

    public List<ProductResponse> findAll() {
        return repository.findAll().stream().map(mapper::toResponse).toList();
    }

    public ProductResponse update(Long id, UpdateProductRequest request) {
        Product existing = repository.findById(id).orElseThrow(exceptions.productNotFound(id));
        ProductResponse before = mapper.toResponseBeforeUpdate(existing, request);
        mapper.applyUpdate(existing, request);
        repository.save(existing);
        return before;
    }

    public void delete(Long id) {
        repository.findById(id).orElseThrow(exceptions.productNotFound(id));
        repository.deleteById(id);
    }
}
