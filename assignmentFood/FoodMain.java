package com.ob.assignmentFood;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class FoodMain {
public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext(AllConfig.class);
	Order order=(Order) context.getBean(Order.class);
	order.assign((Food)context.getBean("friedrice"),(Drinks)context.getBean("coke"));
	order.order();
}
}
