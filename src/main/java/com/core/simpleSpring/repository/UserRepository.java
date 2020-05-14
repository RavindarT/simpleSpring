package com.core.simpleSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.core.simpleSpring.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
