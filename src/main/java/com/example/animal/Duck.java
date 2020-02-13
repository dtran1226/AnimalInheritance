package com.example.animal;

public class Duck extends Bird implements Swimmable, Flyable{
	@Override
	void sound() {
		System.out.println("Quack, quack");
	}

	@Override
	void move() {
		walk();
	}
}
