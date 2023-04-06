package com.ob.assignmentFood;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({FoodConfig.class,DrinkConfig.class})
public class AllConfig {
	@Bean
public Order order( ) {
	return new Order();
}
}
