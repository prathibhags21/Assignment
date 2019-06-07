package com.assign.app.service;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assign.app.dao.LoginDAO;
import com.assign.app.dto.LoginDTO;
import com.assign.app.dto.UserDTO;


@Service
public class LoginService {
	
	@Autowired
	private LoginDAO loginDAO;
	
	private final static  Logger log= LoggerFactory.getLogger(LoginService.class);
	
	
	public LoginService() {
		log.info("LoginService started");
	}


	public UserDTO loginService(LoginDTO loginDTO) {
                      
		UserDTO dtoFrmDB= loginDAO.loginDAO(loginDTO);
		return dtoFrmDB;
	}


	public void updateLastLoginAndFailCounterService(UserDTO dtoFrmDB) {
		
		String email= dtoFrmDB.getEmail();
		Date date = new Date();
		int failCount = 0;
		boolean newUser=false;
		
		log.info("email->"+email);
		log.info("date->"+date);
		log.info("failCount->"+failCount);
		log.info("newUser->"+newUser);
		 
		loginDAO.updateLastLoginAndFailCountDAO(email,date,failCount,newUser);
		
	}


	public void failedLoginService(UserDTO dtoFrmDB) {
		
		loginDAO.failedLoginDAO(dtoFrmDB);
		
	}


	
	
	
	
	
	
	
	
	

}
