package com.ob.assignments;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Lion implements Creature{

	@Override
	public String creatureName() {
		// TODO Auto-generated method stub
		return "Lion";
	}

	@Override
	public String creatureType() {
		// TODO Auto-generated method stub
		return "Animal";
	}

}
