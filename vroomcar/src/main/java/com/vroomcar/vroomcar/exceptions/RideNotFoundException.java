package com.vroomcar.vroomcar.exceptions;

public class RideNotFoundException extends RuntimeException {

    public RideNotFoundException(Long id) {
        super("Ride is not found  " );
    }

}