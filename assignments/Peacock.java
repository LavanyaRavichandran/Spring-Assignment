package com.ob.assignments;

import org.springframework.stereotype.Component;

@Component
public class Peacock implements Creature{

	@Override
	public String creatureName() {
		// TODO Auto-generated method stub
		return "Peacock";
	}

	@Override
	public String creatureType() {
		// TODO Auto-generated method stub
		return "Bird";
	}

}
