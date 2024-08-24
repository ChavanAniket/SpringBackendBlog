package com.chavan.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chavan.blog.entities.Role;

public interface RoleRepo extends JpaRepository<Role,Integer>{

}
