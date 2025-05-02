package com.finalproject.calitatesoftware.services;

import com.finalproject.calitatesoftware.domain.Category;
import com.finalproject.calitatesoftware.domain.Product;
import com.finalproject.calitatesoftware.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService{
    private final ProductRepository productRepository;

    public ProductServiceImpl( ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product createProduct(Product newProduct) {
        return productRepository.save(newProduct);
    }

    public List<Product> getAllProducts(){
        productRepository.findAll();
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(Long id){
        return productRepository.findById(id);
    }

    public Product updateProduct(Long id, String name, String description, Double price, Integer quantity, Category category) {
        Product updatedProduct = productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));

        updatedProduct.setName(name);
        updatedProduct.setDescription(description);
        updatedProduct.setPrice(price);
        updatedProduct.setQuantity(quantity);
        updatedProduct.setCategory(category);

        return productRepository.save(updatedProduct);
    }

    public void deleteProductById(Optional<Product> productId) {
        Product product = productId.orElseThrow(() -> new RuntimeException("Product not found."));
        productRepository.delete(product);
    }
}
