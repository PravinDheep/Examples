package com.examples.junit;

public class TestRunner {

	   private String message;

	   //Constructor
	   //@param message to be printed
	   public TestRunner(String message){
	      this.message = message;
	   }
	      
	   // prints the message
	   public String printMessage(){
	      System.out.println(message);
	      return message;
	   }   
	}