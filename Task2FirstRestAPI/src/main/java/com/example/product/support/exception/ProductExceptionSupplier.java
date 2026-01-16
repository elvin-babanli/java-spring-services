package com.example.product.support.exception;

import org.springframework.stereotype.Component;

import java.util.function.Supplier;

@Component
public class ProductExceptionSupplier {

    public Supplier<ProductNotFoundException> productNotFound(Long id) {
        return () -> new ProductNotFoundException("Product not found. id=" + id);
    }
}
