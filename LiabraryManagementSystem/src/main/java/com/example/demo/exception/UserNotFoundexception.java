package com.example.demo.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;


@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundexception extends RuntimeException {

	public UserNotFoundexception(String message, Throwable cause) {
		super(message, cause);
		
	}

	public UserNotFoundexception(String message) {
		super(message);
		
	} }


