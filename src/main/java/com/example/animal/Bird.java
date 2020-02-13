package com.example.animal;

public abstract class Bird extends Animal implements Walkable, Singable{

	abstract void move();

	@Override
	void sound() {
		sing();
	}
}
