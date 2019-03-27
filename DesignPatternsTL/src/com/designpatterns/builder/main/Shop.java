package com.designpatterns.builder.main;

import com.designpatterns.builder.phone.Phone;
import com.designpatterns.builder.phone.PhoneBuilder;

public class Shop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Phone ph = new PhoneBuilder().setOs("Android").setRam(2).setBattery(3000).getPhone();		
		System.out.println(ph);
	}

}
