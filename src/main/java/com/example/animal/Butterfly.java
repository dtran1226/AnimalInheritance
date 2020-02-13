package com.example.animal;

public class Butterfly extends Caterpillar implements Flyable{

	@Override
	void move() {
		fly();
	}
}
