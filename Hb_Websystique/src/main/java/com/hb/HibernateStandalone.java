package com.hb;

import org.hibernate.Session;

import com.hb.model.Address;
import com.hb.model.Student;

public class HibernateStandalone {

	public static void main(String[] args) {
		Student student = new Student("firstName", "lastName", "Maths");
		Address address = new Address("street","city","country");
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		session.persist(address);
		student.setAddress(address);
		session.persist(student);
		
		session.getTransaction().commit();
		session.close();
		
	}

}
