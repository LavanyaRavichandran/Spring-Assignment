package com.ob.assignment5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.ob.assignment5")
public class Config {
@Bean(name="child")
public Child getChild() {
	return new Child();
}
@Bean(name="Cat")
public Cat getcat() {
	return new Cat();
}
@Bean(name="Dog")
public Dog getDog() {
	return new Dog();
}
}
