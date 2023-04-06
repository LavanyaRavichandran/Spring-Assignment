package com.ob.assignment5;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component

public class Cat implements Pet{

	@Override
	public String petType() {
		
		return "PetName";
	}

	@Override
	public String petName() {
		
		return "Catty";
	}

}
