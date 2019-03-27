package com.designpatterns.factory.phone;

public class IPhone implements OperatingSystem {
	
	@Override
	public void spec() {
		System.out.println("Most Secured OS");
	}
}
