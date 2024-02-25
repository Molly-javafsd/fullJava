package com.example.demo;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
	//customized exception handler
@ExceptionHandler(ResourceNotFoundException.class)
	public  ResponseEntity<?> handleResourceNotFoundException(ResourceNotFoundException exception,WebRequest request){
		ErrorMsg details=new ErrorMsg(new Date(),exception.getMessage(),request.getDescription(false) );
		return new ResponseEntity<>(details,HttpStatus.NOT_FOUND);
	}
	
	//general exception handler
@ExceptionHandler(Exception.class)
public ResponseEntity<?> handleException(Exception ex,WebRequest req){
	ErrorMsg em=new ErrorMsg(new Date(),ex.getMessage(),req.getDescription(false));
	return new ResponseEntity<>(em,HttpStatus.BAD_REQUEST);
}
}
