package com.coderscampus.myapp.main;

import com.coderscampus.myapp.service.MyService;

public class MakePOJO {
    
    private MyService myService = new MyService();
    
    public static void main(String[] args) {


        new MakePOJO().execute();
    }

    private void execute() {
        // Your code goes here, not in the main() method
        // This removes any need to consume statics

    	User PietjePuk = new User();
    	PietjePuk.setUsername("tqe56y4htrgf");
        
    	
    	
    	
        System.out.println("it ran...");
        System.out.println(username " is the greatest");

      }
        
        
    }
    





    
    

