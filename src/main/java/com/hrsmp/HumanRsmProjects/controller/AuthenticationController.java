package com.hrsmp.HumanRsmProjects.controller;

import com.hrsmp.HumanRsmProjects.model.User;
import com.hrsmp.HumanRsmProjects.service.IAuthenticationService;
import com.hrsmp.HumanRsmProjects.service.IUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import lombok.Data;

@Data
@RestController
@RequestMapping("api/authentication") 
public class AuthenticationController {
	
	@Autowired
	private IAuthenticationService authenticationService;
	
	@Autowired
	private IUserService userService;
	
	
	@PostMapping("/sign-up")
	public ResponseEntity<?> signUp(@RequestBody User user){
		
		if (userService.findByUsername(user.getUsername()).isPresent()){
			
			return new ResponseEntity<>(HttpStatus.CONFLICT);
		}
		return new ResponseEntity<>(userService.saveUser(user), HttpStatus.CREATED);
	}
	
	@PostMapping("sign-in")
	public ResponseEntity<?> signIn(@RequestBody com.hrsmp.HumanRsmProjects.model.User user){
		
		return new ResponseEntity<>(authenticationService.signInAndReturnJWT(user), HttpStatus.OK);
	}
	
	

}
