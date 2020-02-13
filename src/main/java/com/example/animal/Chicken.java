package com.example.animal;

public class Chicken extends Bird {
	public Chicken() {
	}
	
	public Chicken (Animal.Gender gender) {
		this.gender = gender;
	}
	@Override
	void sound() {
		if (gender == Animal.Gender.MALE) {
			System.out.println("Cock-a-doodle-doo");
		} else {
			System.out.println("Cluck, cluck");
		}
	}

	@Override
	void move() {
		walk();
	}
}
