package com.finalproject.calitatesoftware.services;

import com.finalproject.calitatesoftware.domain.Category;
import com.finalproject.calitatesoftware.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    Product createProduct(Product product);

    List<Product> getAllProducts();

    Optional<Product> getProductById(Long id);

    Product updateProduct(Long id, String name, String description, Double price, Integer quantity, Category category);

    void deleteProductById(Optional<Product> productId);
}
