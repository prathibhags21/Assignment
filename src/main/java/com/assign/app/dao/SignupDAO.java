package com.assign.app.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.assign.app.dto.UserDTO;

@Repository
public class SignupDAO {
	
	
	@Autowired
	private SessionFactory factory;
	

	public  String signupDAO(UserDTO userDTO)
	{
		System.out.println("SignupDAO started");
		
		String hql="from UserDTO where email=:em";
		Session session= factory.openSession();
		Transaction transaction =session.beginTransaction();
		
		Query query=session.createQuery(hql);
		query.setParameter("em", userDTO.getEmail());
		System.out.println("userDTO->"+userDTO);
		UserDTO dtoFrmDB = (UserDTO) query.uniqueResult();
		System.out.println("dtoFrmDB->"+dtoFrmDB);
		if(dtoFrmDB != null)
		{
			System.out.println("email id is  already present");
			return "email is already present";
			
		}
		else
		{
			session.save(userDTO);
			transaction.commit();
			return "user created successfully";
		}
		
	}
	

	public SignupDAO() {
		
		System.out.println("created SignupDAO \t"+this.getClass().getSimpleName());
		
	}

}
