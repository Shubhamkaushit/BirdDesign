package com.demo;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sparrow sp = new Sparrow();
		sp.plugFlyator(new SlowFlyator());
		sp.fly();
		
		sp.plugFlyator(new FastFlyator());
		sp.fly();
	}

}
