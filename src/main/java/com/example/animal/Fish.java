package com.example.animal;

public class Fish extends Animal implements Swimmable{

	@Override
	void move() {
		swim();
	}

	@Override
	void sound() {
		System.out.println("I am soundind as a fish");
	}

}
