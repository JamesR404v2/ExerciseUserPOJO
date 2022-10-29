package com.coderscampus.myapp.main;

import com.coderscampus.myapp.service.MyService;

import com.coderscampus.myapp.main.User;


public class MakePOJO {
	
	private MyService myService = new MyService();
	
    public static void main(String[] args) {
		new MakePOJO().execute();
	}

	private void execute() {
		// Your code goes here, not in the main() method
		// This removes any need to consume statics

		System.out.println("it ran........");
		
		User Britney = new User();
		Britney.setUsername("fahyahjuea");		
		System.out.println(Britney.getUsername());
		
		
	  }
		
		
	}