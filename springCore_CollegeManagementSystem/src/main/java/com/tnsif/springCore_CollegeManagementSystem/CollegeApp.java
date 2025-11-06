package com.tnsif.springCore_CollegeManagementSystem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollegeApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        College college = (College) context.getBean("college");

        System.out.println("College Name: " + college.getName());
        System.out.println("Departments: " + college.getDepartmentList());

        ((ClassPathXmlApplicationContext) context).close();
    }
}
