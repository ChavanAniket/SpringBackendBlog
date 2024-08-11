package com.chavan.blog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.chavan.blog.entities.Category;
import com.chavan.blog.entities.Post;
import com.chavan.blog.entities.User;

public interface PostRepo extends JpaRepository<Post, Integer>{
	
	List<Post> findByUser(User user);
	List<Post> findByCategory(Category category);
	
	// we can also write custom query (below both function does same thing both can be used)
	@Query("select p from Post p where p.title like :key")
	List<Post> searchByTitle(@Param("key") String title);

	List<Post> findByTitleContaining(String title);
}
