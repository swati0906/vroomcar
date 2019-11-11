package com.vroomcar.vroomcar.repository;
import java.util.List;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.vroomcar.vroomcar.bean.User;
@Component

public interface Userrepository  extends CrudRepository<User, Long> {

	List<User> findUserByEmailId(String email);
	
	
	
	}