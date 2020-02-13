package com.example.animal;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestDuck {
	static Duck duck;
	@BeforeAll
	public static void init() {
		duck = new Duck();
	}
	
	@Test
	public void testSoundByCheckOutput() {
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(output);
		System.setOut(ps);
		duck.sound();
		assertEquals("Quack, quack", output.toString().trim());
	}
	
	@Test
	public void testSwimByCheckInstance() {
		assertTrue(duck instanceof Swimmable);
	}
	
	@Test
	public void testSwimByCheckOutput() {
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(output);
		System.setOut(ps);
		duck.swim();
		assertEquals("I am swimming", output.toString().trim());
	}
	
	@AfterAll
	public static void destroy() {
		duck = null;
	}
}
