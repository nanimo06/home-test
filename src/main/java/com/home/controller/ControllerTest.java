package com.home.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class ControllerTest {

	@GetMapping("name")
	public ResponseEntity<String> getUser(){
		
		
		return new ResponseEntity<String>("name", HttpStatus.OK);
	}
}
