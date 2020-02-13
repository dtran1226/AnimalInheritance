package com.example.animal;

public interface Walkable {
	default void walk() {
		System.out.println("I am walking");
	}
}
