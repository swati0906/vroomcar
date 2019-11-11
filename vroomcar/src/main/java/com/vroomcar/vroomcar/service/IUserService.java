package com.vroomcar.vroomcar.service;
import java.util.List;


import org.springframework.stereotype.Component;

import com.vroomcar.vroomcar.bean.User;


@Component
public interface IUserService {
	 List<User> getAllUsers();
	 
	 
     User getUserById(long userId);
    User getUserByEmailId(String email);
    boolean saveUserDetails(User user);
    void updateUserDetails(User user);
    
 
	
}


