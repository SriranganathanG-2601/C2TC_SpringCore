
package com.tnsif.Ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Oppo oppo = (Oppo) context.getBean("phone");
        oppo.calling();
		oppo.internet();
    }
}
