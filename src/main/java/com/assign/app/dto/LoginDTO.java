package com.assign.app.dto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginDTO {
	
	
	private String email;
	private String password;
	
	private final static  Logger log= LoggerFactory.getLogger(LoginDTO.class);
	
	public LoginDTO() {
		
		log.info("LoginDTO created");
	}
	
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	@Override
	public String toString() {
		return "LoginDTO [email=" + email + ", password=" + password + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
