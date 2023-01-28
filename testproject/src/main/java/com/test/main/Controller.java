package com.test.main;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

	@GetMapping("")
	public ResponseEntity<?> getHeartBeat(){
		return new ResponseEntity<String>("Alive", HttpStatus.OK);
	}
	
	@GetMapping("/test1")
	public ResponseEntity<?> testOne(){
		return new ResponseEntity<String>("test1", HttpStatus.OK);
	}
	
	@GetMapping("/test2")
	public ResponseEntity<?> testTwo(){
		return new ResponseEntity<String>("test2", HttpStatus.OK);
	}
	

}
