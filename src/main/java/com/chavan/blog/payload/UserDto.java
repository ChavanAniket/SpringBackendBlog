package com.chavan.blog.payload;

import java.util.HashSet;
import java.util.Set;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserDto {
	
	private int id;
	
	@NotEmpty
	@Size(min=4, message ="Username must be min of 4 characters")
	private String name;
	
	@Email(message="Email address is not valid !!")
	private String email;
	
	@NotEmpty
	@Size(min = 3, max=10, message ="Password must bemin of 3 chars and max of 10 chars")
//	@Pattern(regexp = )
	private String password;
	
	@NotEmpty
	private String about;
	
	// because a user can have multiple roles
	private Set<RoleDto> roles = new HashSet<>();
	
	

}
