package com.ob.assignments;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EarthMain {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");
	Earth earth=context.getBean(Earth.class);
	earth.living();
}
}
