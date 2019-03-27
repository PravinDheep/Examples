package com.designpatterns.factory.main;

import com.designpatterns.factory.phone.OperatingSystem;
import com.designpatterns.factory.phone.OperatingSystemFactory;

public class FactoryMain {
	public static void main(String[] args) {
		OperatingSystemFactory osf = new OperatingSystemFactory();
		OperatingSystem os = osf.getInstance("Open");
		os.spec();
	}
}
