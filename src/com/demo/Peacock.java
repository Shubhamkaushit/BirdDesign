package com.demo;

import com.interfaces.Flyable;
import com.interfaces.Speakable;

public class Peacock extends Bird implements Flyable, Speakable{

	public void eat() {
		System.out.println("Peacock eats");
	}
	
	public void fly() {
		System.out.println("Peacock Flies");
	}
	
	public void makeSound() {
		System.out.println("Keech Keech");
	}
	
	public void dance() {
		System.out.println("Peacock Dances");
	}
}
