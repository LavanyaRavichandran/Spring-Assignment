package com.ob.assignmentFood;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ob.assignmentFood.Biriyani;
import com.ob.assignmentFood.FriedRice;
import com.ob.assignmentFood.Idli;

@Configuration
public class FoodConfig {
@Bean(name="briyani")
public Biriyani getbiriyani() {
	return new Biriyani();
}
@Bean(name="idli")
public Idli getidli() {
	return new Idli();
}
@Bean(name="friedrice")
public FriedRice getfriedrice() {
	return new FriedRice();
}
}
