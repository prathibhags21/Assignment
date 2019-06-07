package com.assign.app.dao;


import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.assign.app.dto.LoginDTO;
import com.assign.app.dto.UserDTO;

@Repository
public class LoginDAO {
	
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private final static  Logger log= LoggerFactory.getLogger(LoginDAO.class);
	
	
	public UserDTO loginDAO(LoginDTO loginDTO) {
	
		String hql="from UserDTO  where email=:em";
		Session session=sessionFactory.openSession();
	   Query query = session.createQuery(hql);
	   query.setParameter("em", loginDTO.getEmail());
	   UserDTO dtoFrmDB =(UserDTO)query.uniqueResult();
	   
	   return dtoFrmDB;  
		
	}

	
	
	public LoginDAO() {
	   log.info("LoginDAO started");
	}



	public void updateLastLoginAndFailCountDAO(String email, Date date, int failCount, boolean newUser) {
		
		String hql="update UserDTO set lastLogin=:ll, failCount=:fc, newUser=:nu where email=: em";
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Query query=session.createQuery(hql);
		query.setParameter("ll", date);
		query.setParameter("fc", failCount);
		query.setParameter("nu", newUser);
		query.setParameter("em", email);
		
		query.executeUpdate();
		transaction.commit();
		
	}



	public void failedLoginDAO(UserDTO dtoFrmDB) {
	  
		Session session = sessionFactory.openSession();
		Transaction transaction= session.beginTransaction();
		session.saveOrUpdate(dtoFrmDB);
		transaction.commit();
		
	}
	
	
	
}
