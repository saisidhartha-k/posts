package com.prodapt.learningspring.business;

import org.springframework.stereotype.Component;


import com.prodapt.learningspring.entity.User;




//import lombok.Data;

public class LoggedInUser {
    private User loggedInUser;
    
	public User getLoggedInUser() {
		return loggedInUser;
	}

	public void setLoggedInUser(User loggedInUser) {
		this.loggedInUser = loggedInUser;
	}

	public LoggedInUser() {
		super();
	}

	public LoggedInUser(User loggedInUser) {
		super();
		this.loggedInUser = loggedInUser;
	}
}
