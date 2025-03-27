package com.buthdev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.buthdev.course.entitites.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
