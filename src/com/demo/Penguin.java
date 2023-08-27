package com.demo;

import com.interfaces.Speakable;

public class Penguin extends Bird implements Speakable{

	public void eat() {
		System.out.println("Penguin eats");
	}
	
	public void makeSound() {
		System.out.println("Pingu");
	}
}
