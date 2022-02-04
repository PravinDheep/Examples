package com.javasevenfeatures;

public class StringInSwitch {

	//Java 7 features
	
	public static void main(String[] args) {
		String param = "java7";	
		switch (param) {
		case "java6":
				System.out.println("java 6");
				break;
		case "java7":
				System.out.println("java 7");
				break;
			default:
				System.out.println("default");
				break;
		}
	}

}
