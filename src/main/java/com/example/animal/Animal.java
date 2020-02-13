package com.example.animal;

public abstract class Animal {
	abstract void move();
	abstract void sound();
	void eat() {
		System.out.println("I am eating");
	}
	enum Gender {
		MALE,
		FEMALE
	}
	enum Size {
		Small,
		Medium,
		Large,
	}
	Gender gender;
	String color;
	Size size;
}
