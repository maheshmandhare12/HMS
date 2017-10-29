package com.hcm.campaign.model;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class LoginRequest implements Serializable{
   
    private static final long serialVersionUID = 5701068439970966026L;
    
    @NotNull
    @Size(max = 50)
    String userName;
    
    @NotNull
    @Size(max = 50)
    String userPassword;

    @NotNull
    UserType userType;

    public LoginRequest() {
    	
    }
    
	public LoginRequest(String userName, String userPassword, UserType userType) {
		super();
		this.userName = userName;
		this.userPassword = userPassword;
		this.userType = userType;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}
    
    
}
