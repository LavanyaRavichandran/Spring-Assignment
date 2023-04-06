package com.ob.assignmentFood;



public class Order {
	private Food food;
	private Drinks drink;
public void assign(Food food1, Drinks drink1) {
	food=food1;
	drink=drink1;
	
}
public void order() {
	food.food();
	drink.drink();
}
}
