package com.demo;

import com.interfaces.Flyator;

public class SlowFlyator implements Flyator{

	@Override
	public void makeFly() {
		
		System.out.println("This bird flies slow");
	}

}
