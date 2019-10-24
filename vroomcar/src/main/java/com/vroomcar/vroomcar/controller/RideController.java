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

import com.vroomcar.vroomcar.bean.Ride;
import com.vroomcar.vroomcar.exceptions.RideNotFoundException;
import com.vroomcar.vroomcar.service.RideService;

@RestController
@RequestMapping("/VroomCar")

public class RideController {
@Autowired

RideService rideService;


@GetMapping("/Rides")	
    public List<Ride> getAllRides()
     {
	 return rideService.getAllRides();                          
	 }

 @PostMapping("/loadRide")
 public ResponseEntity<Ride> loadRide(@RequestBody final Ride ride ) 
    {
	 System.out.println(ride);
	 rideService.loadRide(ride);
	 
    return new ResponseEntity<Ride>(ride, HttpStatus.OK);
    
    }


@DeleteMapping("Ride/{id}")
public  void deleteRide(@PathVariable("id") long rideId)  {
  rideService.deleteRide( rideId);

}
@PutMapping("/updateRide")
public void updateRide(@RequestBody final Ride ride) {
	 rideService.UpdateRide(ride);


}



	
	
}
