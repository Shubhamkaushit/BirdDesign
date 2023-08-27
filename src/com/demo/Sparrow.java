package com.demo;

import com.interfaces.Flyable;
import com.interfaces.Flyator;
import com.interfaces.Speakable;

public class Sparrow extends Bird implements Flyable, Speakable{
	
	Flyator ftor;
	
	void plugFlyator(Flyator ftor) {
		if(ftor == null) {
			System.out.println("No object passed");
			return;
		}
		this.ftor = ftor;
	}

	@Override
	public void eat() {
		System.out.println("Sparrow eats");
	}
	
	public void fly() {
		System.out.println("Sparrow Flies");
		ftor.makeFly();
	}
	
	public void makeSound() {
		System.out.println("Chi Chi");
	}
	
	public void dance() {
		System.out.println("Peacock Dances");
	}
}
