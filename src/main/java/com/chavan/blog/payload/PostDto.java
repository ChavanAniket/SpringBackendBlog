package com.chavan.blog.payload;

import java.time.LocalDateTime;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PostDto {
	
	private String title;
	private String content;	
	private String imageName;
	private LocalDateTime addedDate;
	private CategoryDto category;
	private UserDto user;
	

}
