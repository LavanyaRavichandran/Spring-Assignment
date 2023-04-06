package com.ob.assignmentFood;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DrinkConfig {
	@Bean(name="coke")
public CocaCola getCoke() {
	return new CocaCola();
}
	@Bean(name="shake")
public MilkShake getShake() {
	return new MilkShake();
}
	@Bean(name="juice")
public AppleJuice getJuice() {
	return new AppleJuice();
}
}
