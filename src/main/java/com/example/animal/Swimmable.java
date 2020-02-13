package com.example.animal;

public interface Swimmable {
	default void swim() {
		System.out.println("I am swimming");
	}
}
