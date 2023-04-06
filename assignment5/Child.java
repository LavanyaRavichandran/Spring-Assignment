package com.ob.assignment5;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
@Component
@PropertySource("classpath:values.properties")
public class Child {
	@Value("Lucky")
	private String name;
	@Value("20")
	private int age;
	@Value("Female")
	private String gender;
	@Value("12")
	private int standard;
	@Value("${value.of.list}")
	private List<String> hobbies;
	@Value("${value.of.set}")
	private Set<String> subjectsStudying;
	@Value("#{${value.of.map}}")
	private Map<String, String> friendsAndGender;
	@Autowired
	private Pet pet;
	

	public void display() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);
		System.out.println(standard);
		System.out.println( hobbies);
		System.out.println(subjectsStudying);
		System.out.println(friendsAndGender);
		System.out.println(pet.petName()+""+pet.petType());
		
	}
}
