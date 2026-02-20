package com.b9.json.jsonplatform.controller;

import com.b9.json.jsonplatform.model.Product;
import com.b9.json.jsonplatform.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@CrossOrigin(origins = "*")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/add")
    public Product addProduct(@RequestBody Product product) {
        return productRepository.save(product); // Menyimpan ke DB
    }

    @GetMapping("/list")
    public List<Product> getAllProducts() {
        return productRepository.findAll(); // Mengambil semua data dari DB
    }
}