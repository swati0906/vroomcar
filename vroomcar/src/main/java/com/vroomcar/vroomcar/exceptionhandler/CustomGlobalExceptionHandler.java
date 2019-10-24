 package com.vroomcar.vroomcar.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

import com.vroomcar.vroomcar.exceptions.rideAlreadyExistsExceptions;

import javax.servlet.http.HttpServletResponse;
import javax.validation.ConstraintViolationException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@ControllerAdvice
public class CustomGlobalExceptionHandler extends ResponseEntityExceptionHandler
{
@ExceptionHandler(rideAlreadyExistsExceptions.class)
public ResponseEntity<CustomErrorResponse> rideAlreadyeExistsException (Exception ex, WebRequest request) {

    CustomErrorResponse errors = new CustomErrorResponse();
    errors.setTimestamp(LocalDateTime.now());
    errors.setError(ex.getMessage());
    errors.setStatus(HttpStatus.NOT_FOUND.value());

    return new ResponseEntity<>(errors, HttpStatus.NOT_FOUND);
    }
@ExceptionHandler(RuntimeException.class)
public ResponseEntity<String> handleRuntimeException (RuntimeException e) {
	 CustomErrorResponse errors = new CustomErrorResponse();
	    errors.setTimestamp(LocalDateTime.now());
	    errors.setError(e.getMessage());
	    errors.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());

	   return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }



}