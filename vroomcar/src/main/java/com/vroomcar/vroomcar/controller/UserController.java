package com.vroomcar.vroomcar.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.vroomcar.vroomcar.bean.User;
import com.vroomcar.vroomcar.service.UserService;

@RestController
@RequestMapping("/VroomCar")

public class UserController {
@Autowired

UserService userService;


@GetMapping("/Users/{userid}")	
    public List<User> getAllUsers()
     {
	 return userService.getAllUsers();                          
	 }

 @PostMapping("/SaveUser")
 public ResponseEntity<User> saveUserDetails(@RequestBody final User user ) 
    {
	 System.out.println(user);
	 userService.saveUserDetails(user);
	 
    return new ResponseEntity<User>(user, HttpStatus.OK);
    
    }




@PutMapping("/updateUser")
public void updateUserDetails(@RequestBody final User user) {
	 userService.updateUserDetails(user);


}



	
	
}
