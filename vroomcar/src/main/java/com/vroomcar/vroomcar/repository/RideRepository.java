package com.vroomcar.vroomcar.repository;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.vroomcar.vroomcar.bean.Ride;
@Component

public interface RideRepository  extends CrudRepository<Ride, Long> {
	List<Ride> findByRiderName(String riderName);
	
	
	}
