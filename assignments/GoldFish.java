package com.ob.assignments;

import org.springframework.stereotype.Component;

@Component
public class GoldFish implements Creature{

	@Override
	public String creatureName() {
		// TODO Auto-generated method stub
		return "Goldfish";
	}

	@Override
	public String creatureType() {
		// TODO Auto-generated method stub
		return "Waterbeing";
	}

}
