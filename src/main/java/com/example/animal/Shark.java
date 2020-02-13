package com.example.animal;


public class Shark extends Fish{
	public Shark() {
		size = Size.Large;
		color = "Grey";
	}
	@Override
	void eat() {
		System.out.println("I am eating other fish");
	}
}
