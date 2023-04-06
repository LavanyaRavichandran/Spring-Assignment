package com.ob.assignment5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ChildMain {
public static void main(String[] args) {

	ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
	Child child=(Child) context.getBean("child");
	child.display();
}
}
