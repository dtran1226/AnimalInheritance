package com.example.animal;

public class Dolphin extends Animal implements Swimmable{

	@Override
	void move() {
		swim();
	}

	@Override
	void sound() {
		System.out.println("I am sounding as a dolphin");
	}
}
