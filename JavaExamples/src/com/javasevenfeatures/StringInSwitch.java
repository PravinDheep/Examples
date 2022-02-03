package com.javasevenfeatures;

public class StringInSwitch {

	//Java 7 features
	
	public static void main(String[] args) {
		String param = "java6";	
		switch (param) {
		case "java5":
				System.out.println("java 5");
				break;
		case "java6":
				System.out.println("java 6");
				break;
			default:
				System.out.println("default");
				break;
		}
	}

}
