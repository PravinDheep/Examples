package com.designpatterns.factory.phone;

public class OperatingSystemFactory {

	public OperatingSystem getInstance(String os) {
		if(os.equals("Open")) {
			return new Android();
		}else if(os.equals("Closed")) {
			return new IPhone();
		}else {
			return new Windows();
		}		
	}

}
