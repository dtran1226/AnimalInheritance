package com.example.animal;

public class Chicken extends Bird {
	@Override
	void sound() {
		System.out.println("Cluck, cluck");
	}

	@Override
	void move() {
		walk();
	}
}
