package com.demo;

import com.interfaces.Danceable;
import com.interfaces.Speakable;

public class Kiwi extends Bird implements Speakable, Danceable{

	public void eat() {
		System.out.println("Kiwi eats");
	}
	
	public void makeSound() {
		System.out.println("Ku Ku");
	}
	
	public void dance() {
		System.out.println("Peacock Dances");
	}
}
