package com.assign.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

import com.assign.app.dao.SignupDAO;
import com.assign.app.dto.UserDTO;



@Service
public class SignupService {
 
	
	@Autowired
	private SignupDAO signupDAO;
	
	
	@Autowired
	private MailSender sender;
	
	
	public String  SignupService(UserDTO userDTO)
	{
		System.out.println("signupService started");
		userDTO.setNewUser(true);
		
		// Generate random password
		userDTO.setPassword("12345");
		
		System.out.println(userDTO);
		
		String result= signupDAO.signupDAO(userDTO);
		
	//	String result =signupDAO.signupDAO(userDTO);
	
		//  email
		
		String email= userDTO.getEmail();
		String password = userDTO.getPassword();
		String subject ="confirmation mail from Assignment Management"; 
		String text="your account is created \n" + "please login  by using \n "+
		"email : \n" +email + 
		"password : "+password;
		String emailResult=sendMail(email,subject,text,password);
		System.out.println(emailResult);
		System.out.println("signupService ended");
		return result;
	}
	
	
	public SignupService()
	{
		System.out.println("created service \t"+this.getClass().getSimpleName());
	}

	
	public String sendMail(String to , String subject, String text, String password)
	{
		SimpleMailMessage simpleMessege = new SimpleMailMessage();
		
		simpleMessege.setTo(to);
		simpleMessege.setSubject(subject);
		simpleMessege.setText(text);
		sender.send(simpleMessege);
		return " mail sent to " +to;
				
	}
	
	}


