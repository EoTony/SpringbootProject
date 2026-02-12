package com.example.course.Repositories;

import com.example.course.entities.OrderItem;
import com.example.course.entities.PK.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
