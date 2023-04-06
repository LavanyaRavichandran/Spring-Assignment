package com.ob.assignments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Earth {
	private double planetRadius=100.00;
	private double waterOnPlanetPercentage=73.8;
	@Autowired

	private Creature creature;
	public void living() {
		System.out.println(creature.creatureName());
		System.out.println(creature.creatureType());
		System.out.println(planetRadius);
		System.out.println(waterOnPlanetPercentage);
		
		
	}
}
