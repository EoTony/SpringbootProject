package com.example.course.services;

import com.example.course.Repositories.ProductRepository;
import com.example.course.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll(){
        List<Product> products = productRepository.findAll();
        return products;
    }
}
