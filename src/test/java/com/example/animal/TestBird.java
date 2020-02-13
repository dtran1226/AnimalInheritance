package com.example.animal;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestBird {
	static Bird bird;
	@BeforeAll
	public static void init() {
		bird = new Bird();
	}
	
	@Test
	public void testSingByCheckInstance() {
		assertTrue(bird instanceof Singable);
	}
	
	@Test
	public void testSingByCheckOutput() {
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(output);
		System.setOut(ps);
		bird.sound();
		assertEquals("I am singing", output.toString().trim());
	}
	
	@AfterAll
	public static void destroy() {
		bird = null;
	}
}