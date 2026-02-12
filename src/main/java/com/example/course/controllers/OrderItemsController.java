package com.example.course.controllers;

import com.example.course.Repositories.OrderItemRepository;
import com.example.course.entities.OrderItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "orderitems")
public class OrderItemsController {

    @Autowired
    private OrderItemRepository orderItemRepository;

    @GetMapping
    public ResponseEntity<List<OrderItem>> findAll() {
        return ResponseEntity.ok().body(orderItemRepository.findAll());
    }
}
