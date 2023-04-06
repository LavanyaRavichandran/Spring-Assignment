package com.ob.assignment5;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Dog implements Pet{

	@Override
	public String petType() {
		
		return "PetAnimal";
	}

	@Override
	public String petName() {
		
		return "Rambo";
	}

}
