package com.vroomcar.vroomcar.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vroomcar.vroomcar.bean.Employee;
 
@RestController
@RequestMapping("Rest")
public class employeeController
{    //move to service
	//autowiring of service
	static List<Employee> employeesList = new ArrayList<Employee>(); 
	
	 static void CreateData() {
    employeesList.add(new Employee(1,"lokesh","gupta","java@gmail.com"));
    employeesList.add(new Employee(2,"swati","jha","abc@gmail.com"));
    employeesList.add(new Employee(3,"jay","joe","pnm@gmail.com"));
    
	}
	 
    static {
    	CreateData();	
    }
    
   @GetMapping("/helloWorld")
    public List<Employee> getEmployees()
    {
	   //call service.getAllRides();
	 //  CreateData();
//allRides     
	   return employeesList;
    }
   @DeleteMapping("/helloWorld/{id}")
   public List<Employee> deleteEmployee(@PathVariable int id) {
	  System.out.print(id);
	 
	   for (Iterator<Employee> iterator = employeesList.iterator(); iterator.hasNext(); ) {
		   Employee value = iterator.next();
	       if (value.getId() == id) {
	           iterator.remove();
	           return employeesList;
	           //ride/{id}
	       }
	   }
       return employeesList;
}
}
