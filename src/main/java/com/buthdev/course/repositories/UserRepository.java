package com.buthdev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.buthdev.course.entitites.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
