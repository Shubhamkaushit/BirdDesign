package com.demo;

import com.interfaces.Flyable;
import com.interfaces.Speakable;

public class Sparrow extends Bird implements Flyable, Speakable{

	@Override
	public void eat() {
		System.out.println("Sparrow eats");
	}
	
	public void fly() {
		System.out.println("Sparrow Flies");
	}
	
	public void makeSound() {
		System.out.println("Chi Chi");
	}
	
	public void dance() {
		System.out.println("Peacock Dances");
	}
}
