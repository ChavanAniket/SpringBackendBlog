package com.chavan.blog.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chavan.blog.payload.ApiResponse;
import com.chavan.blog.payload.UserDto;
import com.chavan.blog.services.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	//POST-create user
	@PostMapping("/")
	public ResponseEntity<UserDto> createUser(@Valid @RequestBody UserDto userDto)
	{
		System.out.println("user: "+userDto);
		UserDto createUserDto = this.userService.createUser(userDto);
		return new ResponseEntity<>(createUserDto,HttpStatus.CREATED);
	}
	
	//PUT- update user
	@PutMapping("/{userId}")
	public ResponseEntity<UserDto> updateUser(@Valid @RequestBody UserDto userDto, @PathVariable Integer userId)
	{
		UserDto updatedUser = this.userService.updateUser(userDto, userId);
		return ResponseEntity.ok(updatedUser);
	}
	
	//DELETE delete user
	
	@DeleteMapping("/{userId}")
	public ResponseEntity<?> deleteUser(@PathVariable Integer userId)
	{
		this.userService.deleteUser(userId);
		return new ResponseEntity<ApiResponse>(new ApiResponse("User deleted Successfully",true), HttpStatus.OK);
		
//		return new ResponseEntity(Map.of("message", "User Deleted successfully"), HttpStatus.OK);
	}
	//GET - user get
	
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@GetMapping("/")
	public ResponseEntity<List<UserDto>> getAllUsser()
	{
		return ResponseEntity.ok(this.userService.getAllUsers());
	}
	
	@GetMapping("/{userId}")
	public ResponseEntity<UserDto> getSingleUser(@PathVariable Integer userId)
	{
		return ResponseEntity.ok(this.userService.getUserById(userId));
	}
	
	}
