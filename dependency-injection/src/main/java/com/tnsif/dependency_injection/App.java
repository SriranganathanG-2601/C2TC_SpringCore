package com.tnsif.dependency_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App {
public static void main(String[] args) {
		
		ApplicationContext con=new ClassPathXmlApplicationContext("beans.xml");
		
		//setter injection
		Student thamizh=con.getBean("Ranga",Student.class);
		Student kalai=con.getBean("Sri",Student.class);
		
		thamizh.showInfo();
		kalai.showInfo();
		
		//Constructor injection
		Student1 sk=con.getBean("karthi",Student1.class);
		Student1 hm=con.getBean("sachin",Student1.class);
		
		sk.showInfo();
		hm.showInfo();
		
	}
}