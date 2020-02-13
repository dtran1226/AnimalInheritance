package com.example.animal;

public interface Singable {
	default void sing() {
		System.out.println("I am singing");
	}
}
