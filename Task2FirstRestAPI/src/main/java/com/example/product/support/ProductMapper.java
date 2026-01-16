package com.example.product.support;

import com.example.product.api.request.ProductRequest;
import com.example.product.api.request.UpdateProductRequest;
import com.example.product.api.response.ProductResponse;
import com.example.product.domain.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    public Product toProduct(ProductRequest request) {
        return new Product(null, request.getName());
    }

    public ProductResponse toResponse(Product product) {
        return new ProductResponse(product.getId(), product.getName());
    }

    public ProductResponse toResponseBeforeUpdate(Product existing, UpdateProductRequest request) {
        return new ProductResponse(existing.getId(), existing.getName());
    }

    public void applyUpdate(Product existing, UpdateProductRequest request) {
        existing.setName(request.getName());
    }
}
