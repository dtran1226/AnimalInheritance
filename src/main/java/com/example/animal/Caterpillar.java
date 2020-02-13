package com.example.animal;

public class Caterpillar extends Animal implements Walkable{

	@Override
	public void walk() {
		System.out.println("I am walking by crawling");
	}
	
	@Override
	void move() {
		walk();
	}

	@Override
	void sound() {
		System.out.println("I cant make a sound");
	}

}
