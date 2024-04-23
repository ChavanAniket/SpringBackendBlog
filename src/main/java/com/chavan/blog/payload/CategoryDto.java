package com.chavan.blog.payload;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CategoryDto {

	private Integer categoryId;
	
	private String categoryTitle;

	private String categoryDescription;
}
