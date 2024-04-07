package com.chavan.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chavan.blog.entities.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
