package com.nt.beans;

import java.util.Date;

import lombok.Data;

@Data
public class WishMessageGenerator {

	private Date date;
	
	
	//Businesss method using the injected Date class object in the b.logic
	public String generateWishMessage(String user) {
		int hour = 0;
		//get current hour of day
		hour = date.getHours(); //gives 24 hour format
		//b.logic to generate wish message
		if(hour<12)
			return "Good Morning::"+user;
		else if(hour<16)
			return "Good Afternoon::"+user;
		else if(hour<20)
			return "Good Evening::"+user;
		else
			return "Good Night::"+user;
		
	}
}
