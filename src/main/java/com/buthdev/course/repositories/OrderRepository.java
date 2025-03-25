package com.buthdev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.buthdev.course.entitites.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
