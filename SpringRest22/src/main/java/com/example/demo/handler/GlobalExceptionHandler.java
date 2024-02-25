package com.example.demo.handler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.example.demo.error.ErrorMsg;

@ControllerAdvice
public class GlobalExceptionHandler {
@ExceptionHandler(Exception.class)
public ResponseEntity<?> handleException(Exception ex,WebRequest req){
	ErrorMsg msg=new ErrorMsg(new Date(),ex.getMessage(), req.getDescription(false));
	return new ResponseEntity<>(msg,HttpStatus.BAD_REQUEST);
}
	
}
