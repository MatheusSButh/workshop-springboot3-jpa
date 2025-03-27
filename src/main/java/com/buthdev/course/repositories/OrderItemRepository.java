package com.buthdev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.buthdev.course.entitites.OrderItem;
import com.buthdev.course.entitites.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
