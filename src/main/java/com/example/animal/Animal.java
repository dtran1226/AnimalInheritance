package com.example.animal;

public abstract class Animal {
	abstract void move();
	abstract void sound();
	enum Gender {
		MALE,
		FEMALE
	}
	Gender gender;
}
