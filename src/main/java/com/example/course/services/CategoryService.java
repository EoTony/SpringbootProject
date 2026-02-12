package com.example.course.services;

import com.example.course.Repositories.CategoryRepository;
import com.example.course.entities.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll() {
        List<Category> categories = categoryRepository.findAll();
        return categories;
    }
}
