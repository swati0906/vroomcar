package com.vroomcar.vroomcar.service;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import com.vroomcar.vroomcar.bean.User;
import com.vroomcar.vroomcar.exceptions.rideAlreadyExistsExceptions;
import com.vroomcar.vroomcar.repository.Userrepository;
@Component

public class UserService implements IUserService {
	@Autowired
	
	Userrepository  userrepository;

	  List<User> UserList = new ArrayList<User>();
	 //add data
		
	/*static{
		 RideList.add(new Ride(1,34,"yash","baleno",3,"pimpri","dhapodi",23,"no","yes",1,"y",23,"n"));
		   RideList.add(new Ride(3,34,"swati","baleno",3,"pimpri","dhapodi",23,"no","yes",2,"y",23,"n"));
		   }*/

	public boolean saveUserDetails(User user) {
		//check if ride already exists in the list
	       /* boolean flag=false;
		 for (Iterator<Ride> iterator = RideList.iterator(); iterator.hasNext(); ) {
			   Ride value = iterator.next();
			    if (value.getRideid() == ride.getRideid()) 
		       {
		    	   throw new rideAlreadyExistsExceptions("ride already exist");
		       }
		       }
		 if(flag==true)
		 {
			 System.out.println("already exists");
		 }
		 else
			 System.out.println("new Ride");
			 */
		       userrepository.save(user);
		 
		
	//	System.out.println(RideList);
		// TODO Auto-generated method student
		
		return true;
	}
	
	@Override
	public void updateUserDetails(User user) {
		// for (Iterator<Ride> iterator = RideList.iterator(); iterator.hasNext();) {
			  // Ride value = iterator.next();
		      // if (value.getRideid() == ride.getRideid()) {
		        //   RideList.remove(iterator);
		         //  RideList.add(ride);
		          // return RideList;
		           //ride/{id}
		       userrepository.save(user);
		      
		       
		 }
	@Override
	public User getUserById(long userId)  {
    User obj = userrepository.findById(userId).get();
     return obj;
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getUserByEmailId(String email) {
		User obj = userrepository.findUserByEmailId(email).get(0);
		return obj;
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	

	


	        
	  
	     //@Override
       // public void deleteRide(ride,id);
	     
}
