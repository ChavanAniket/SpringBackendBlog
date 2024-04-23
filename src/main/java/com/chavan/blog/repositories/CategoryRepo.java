package com.chavan.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chavan.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
