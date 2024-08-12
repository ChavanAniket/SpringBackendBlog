package com.chavan.blog.services;

import com.chavan.blog.payload.CommentDto;


public interface CommentService {
	
	CommentDto createComment(CommentDto commentDto, Integer postId);
	void deleteComment(Integer commentId);

}
