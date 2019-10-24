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

import com.vroomcar.vroomcar.bean.Employee;
import com.vroomcar.vroomcar.bean.Ride;
import com.vroomcar.vroomcar.exceptions.rideAlreadyExistsExceptions;
import com.vroomcar.vroomcar.repository.RideRepository;
@Component

public class RideService implements IRideService {
	@Autowired
	
	RideRepository  riderepository;

	  List<Ride> RideList = new ArrayList<Ride>();
	 //add data
		
	/*static{
		 RideList.add(new Ride(1,34,"yash","baleno",3,"pimpri","dhapodi",23,"no","yes",1,"y",23,"n"));
		   RideList.add(new Ride(3,34,"swati","baleno",3,"pimpri","dhapodi",23,"no","yes",2,"y",23,"n"));
		   }*/

	public boolean loadRide(Ride ride) {
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
		       riderepository.save(ride);
		 
		
	//	System.out.println(RideList);
		// TODO Auto-generated method student
		
		return true;
	}
	
	@Override
	public void UpdateRide(Ride ride) {
		// for (Iterator<Ride> iterator = RideList.iterator(); iterator.hasNext();) {
			  // Ride value = iterator.next();
		      // if (value.getRideid() == ride.getRideid()) {
		        //   RideList.remove(iterator);
		         //  RideList.add(ride);
		          // return RideList;
		           //ride/{id}
		       riderepository.save(ride);
		      
		       
		 }
		
	
	
	
	@Override
	public List<Ride> getAllRides(long rideid) {
		List<Ride> list = new ArrayList<>();
		riderepository.findAll().forEach(e -> list.add(e));
		return list;
		
	
	}
	
	
	
	@Override
	public  void deleteRide(long rideId) {
		// for (Iterator<Ride> iterator = RideList.iterator(); iterator.hasNext(); ) {
			 //  Ride value = iterator.next();
		     // if (value.getRideid() == rideId) {
		         //  iterator.remove();
		          // return RideList;
		      // }
		 //}
		riderepository.deleteById(rideId);
	}
	
	@Override
	public Ride getRideById(long rideId) {

    Ride obj = riderepository.findById(rideId).get();
     return obj;
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Ride> getAllRides() {
		// TODO Auto-generated method stub
		return null;
	}

	


	        
	  
	     //@Override
       // public void deleteRide(ride,id);
	     
}
