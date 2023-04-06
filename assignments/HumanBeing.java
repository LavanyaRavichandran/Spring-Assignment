package com.ob.assignments;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class HumanBeing implements Creature {

	@Override
	public String creatureName() {
		// TODO Auto-generated method stub
		return "Human";
	}

	@Override
	public String creatureType() {
		// TODO Auto-generated method stub
		return "Human";
	}

}
