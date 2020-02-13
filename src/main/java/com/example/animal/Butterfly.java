package com.example.animal;

public class Butterfly extends Animal implements Flyable{

	@Override
	void move() {
		fly();
	}

	@Override
	void sound() {
		System.out.println("I cant make a sound");
	}
}
