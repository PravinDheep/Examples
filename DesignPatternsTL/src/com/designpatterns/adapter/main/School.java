package com.designpatterns.adapter.main;

import com.designpatterns.adapter.AssignmentWork;
import com.designpatterns.adapter.Pen;
import com.designpatterns.adapter.PenAdapter;

public class School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AssignmentWork aw = new AssignmentWork();
		//PilotPen p = new PilotPen();
		Pen p = new PenAdapter();
		
		aw.setP(p);
		aw.writeAssignment("I am bit tired to write an assignment");
	}

}
