package com.scemplogin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scemplogin.dto.LoginDto;
import com.scemplogin.dto.LoginResponse;
import com.scemplogin.service.SCEmpLoginService;

@RestController
@RequestMapping("/sc/emp")
@CrossOrigin("*")
public class SCEmpLoginController {

	
	@Autowired
	private SCEmpLoginService scEmpLoginService;
	
	@PostMapping("/login")
	public LoginResponse empLogin(@RequestBody LoginDto login) throws Exception {
		return scEmpLoginService.empLogin(login);
	}
	
}
