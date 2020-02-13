package com.example.animal;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		Animal[] animals = new Animal[] {
				new Duck(),
				new Chicken(),
				new Chicken(Animal.Gender.MALE),
				new Parrot(),
				new Shark(),
				new Clownfish(),
				new Dolphin(),
				new Butterfly(),
				new Caterpillar(
						)
		};
		
		long noOfFlyable = Arrays.stream(animals).filter(n -> n instanceof Flyable).count();
		long noOfWalkable = Arrays.stream(animals).filter(n -> n instanceof Walkable).count();
		long noOfSingable = Arrays.stream(animals).filter(n -> n instanceof Singable).count();
		long noOfSwimable = Arrays.stream(animals).filter(n -> n instanceof Swimmable).count();
		System.out.println(noOfFlyable+"/"+noOfWalkable+"/"+noOfSingable+"/"+noOfSwimable);
	}
}
