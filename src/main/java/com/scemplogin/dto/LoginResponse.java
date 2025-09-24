package com.scemplogin.dto;

import com.common.dto.JwtResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class LoginResponse {
	
	private String empName;
	
	private int empId;
	
	private String designation;
	
	private JwtResponse jwt;
	
	private boolean isLoginSuccess;
	
	private String reason;

}
