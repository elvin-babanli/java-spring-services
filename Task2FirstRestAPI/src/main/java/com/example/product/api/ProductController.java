package com.example.product.api;

import com.example.product.api.request.ProductRequest;
import com.example.product.api.request.UpdateProductRequest;
import com.example.product.api.response.ProductResponse;
import com.example.product.service.ProductService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @Operation(summary = "Create product")
    @PostMapping
    public ResponseEntity<ProductResponse> create(@RequestBody ProductRequest request) {
        ProductResponse response = service.create(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @Operation(summary = "Get product by id")
    @GetMapping("/{id}")
    public ResponseEntity<ProductResponse> find(@PathVariable Long id) {
        return ResponseEntity.ok(service.find(id));
    }

    @Operation(summary = "Get all products")
    @GetMapping
    public ResponseEntity<List<ProductResponse>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @Operation(summary = "Update product by id (returns previous state)")
    @PutMapping("/{id}")
    public ResponseEntity<ProductResponse> update(@PathVariable Long id, @RequestBody UpdateProductRequest request) {
        return ResponseEntity.ok(service.update(id, request));
    }

    @Operation(summary = "Delete product by id")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
