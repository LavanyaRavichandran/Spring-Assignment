package com.ob.assignment4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectMain {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("bean2.xml");
	Collect collect=(Collect) context.getBean(Collect.class);
	System.out.println(collect.getList());
	System.out.println(collect.getMap());
	System.out.println(collect.getSet());
	
	
	System.out.println(collect.getProperty());
	
}
}
