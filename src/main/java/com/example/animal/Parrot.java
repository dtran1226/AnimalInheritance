package com.example.animal;

public class Parrot extends Bird implements Flyable {
	enum Imitate {
		DOG, CAT, ROOSTER
	}

	Imitate imitate;

	@Override
	void move() {
		fly();
	}

	@Override
	void sound() {
		switch (imitate) {
		case DOG:
			System.out.println("Woof, woof");
			break;
		case CAT:
			System.out.println("Meow");
			break;
		case ROOSTER:
			System.out.println("Cock-a-doodle-doo");
			break;
		default:
			break;
		}
	}
}
