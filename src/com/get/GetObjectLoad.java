package com.get;

import org.hibernate.Session;

public class GetObjectLoad {
	public static void main(String[] args) {
		GetObjectLoad g = new GetObjectLoad();
		g.loadData();
		g.getData();
	}
	
	public void loadData(){
		
		Session session = HibernateUtil.getSession();
		Student s = (Student) session.load(Student.class, "10");
		System.out.println("Using Load Method:"+s);
		try{
		}
		catch(Exception e){
			System.out.println("Object not found");
		}
	}
	
	public void getData(){
		Session session = HibernateUtil.getSession();
		Student s = (Student) session.get(Student.class, "20");
		System.out.println("Using get Method:"+s);
	}
}
