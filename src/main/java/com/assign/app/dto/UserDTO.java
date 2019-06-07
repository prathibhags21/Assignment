package com.assign.app.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class UserDTO  implements Serializable {

 @Column(name="FNAME")	
 private String fName;
 
 @Column(name="LNAME")
 private String lName;
 
 @Column(name="CCODE")
 private String cCode;
 
 @Column(name="CONTACTNO")
 private long contactNo;
 
 @Id
 @Column(name="EMAIL")
 private String email;
 
 @Column(name="NEW_USER")
 private boolean newUser =true;
 
 @Column(name="PASSWORD")
 private String password;
 
 @Column(name="FAIL_COUNT")
 private Integer failCount;
 
 @Column(name="LAST_LOGIN")
 private Date lastLogin;
 
 
 
 
 public UserDTO() {
	 
	 System.out.println("created DTO \t"+this.getClass().getSimpleName());
}

public String getfName() {
	return fName;
}

public void setfName(String fName) {
	this.fName = fName;
}

public String getlName() {
	return lName;
}

public void setlName(String lName) {
	this.lName = lName;
}

public String getcCode() {
	return cCode;
}

public void setcCode(String cCode) {
	this.cCode = cCode;
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

public long getContactNo() {
	return contactNo;
}

public void setContactNo(long contactNo) {
	this.contactNo = contactNo;
}

public boolean isNewUser() {
	return newUser;
}

public void setNewUser(boolean newUser) {
	this.newUser = newUser;
}


public Integer getFailCount() {
	return failCount;
}

public void setFailCount(Integer failCount) {
	this.failCount = failCount;
}

public Date getLastLogin() {
	return lastLogin;
}

public void setLastLogin(Date lastLogin) {
	this.lastLogin = lastLogin;
}

@Override
public String toString() {
	return "UserDTO [fName=" + fName + ", lName=" + lName + ", cCode=" + cCode + ", contactNo=" + contactNo + ", email="
			+ email + ", newUser=" + newUser + ", password=" + password + ", failCount=" + failCount + ", lastLogin="
			+ lastLogin + "]";
}


}
