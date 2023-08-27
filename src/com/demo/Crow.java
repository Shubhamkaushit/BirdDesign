package com.demo;

import com.interfaces.Flyable;
import com.interfaces.Speakable;

public class Crow extends Bird implements Flyable, Speakable{

	@Override
	public void eat() {
		System.out.println("Crow eats");
	}
	
	public void fly() {
		System.out.println("Crow Flies");
	}
	
	public void makeSound() {
		System.out.println("Kaw Kaw");
	}
	
	public void dance() {
		System.out.println("Peacock Dances");
	}
}
