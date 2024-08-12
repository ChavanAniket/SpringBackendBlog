package com.chavan.blog.repositories;

import com.chavan.blog.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepo extends JpaRepository<Comment, Integer>{
	

}
