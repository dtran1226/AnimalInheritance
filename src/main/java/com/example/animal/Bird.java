package com.example.animal;

public class Bird extends Animal implements Walkable, Flyable, Singable{

	@Override
	void move() {
		fly();
	}

	@Override
	void sound() {
		sing();
	}

}
