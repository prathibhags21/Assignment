package com.assign.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.assign.app.dto.UserDTO;
import com.assign.app.service.SignupService;

@Controller
@RequestMapping("/")
public class SignupContoller {
	
	
	@Autowired
	private SignupService signupService;
	
	private final static  Logger log= LoggerFactory.getLogger(SignupContoller.class);
	
	
	@RequestMapping(value="/Signup.ams", method=RequestMethod.POST)
	public ModelAndView SignupContoller(UserDTO userDTO)
	{
		//System.out.println("SignupController started");
		log.info("SignupController started");
		
		//System.out.println(userDTO);
		log.info(userDTO.toString());
		
	  String result= signupService.SignupService(userDTO);
	   
	  log.info("SignupController ended");
		//System.out.println("SignupController ended");
		return new  ModelAndView("index","msg",result);
		
	}


    
	public SignupContoller() {
	  System.out.println("created Controller \t"+this.getClass().getSimpleName());
	}
	
	
	
	
	
	
	
	
	
	
	
}
