package com.chavan.blog.services;

import java.util.List;

import com.chavan.blog.payload.UserDto;

public interface UserService {
	
	UserDto registerNumUser(UserDto userDto);
	
	UserDto createUser(UserDto user);
	UserDto updateUser(UserDto user, Integer userId);
	UserDto getUserById(Integer userId);
	List<UserDto> getAllUsers();
	void deleteUser(Integer userId);

}
