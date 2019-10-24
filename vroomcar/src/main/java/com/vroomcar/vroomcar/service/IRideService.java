package com.vroomcar.vroomcar.service;

import java.util.List;


import org.springframework.stereotype.Component;
import com.vroomcar.vroomcar.bean.Ride;


@Component
public interface IRideService {
	 List<Ride> getAllRides();
	
	 
     Ride getRideById(long rideId);
    // boolean addRide(Ride ride);
     void UpdateRide(Ride ride);
    void deleteRide(long rideId);	
   // List <Ride> saveRide(Ride ride);
    boolean loadRide(Ride ride);
  List<Ride> getAllRides(long rideid);
	
}
