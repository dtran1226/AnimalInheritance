package com.example.animal;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestChicken {
	static Chicken chicken;
	@BeforeAll
	public static void init() {
		chicken = new Chicken();
	}
	
	@Test
	public void testSoundOfChicken() {
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(output);
		System.setOut(ps);
		chicken.sound();
		assertEquals("Cluck, cluck", output.toString().trim());
	}
	
	@Test
	public void testSoundOfRooster() {
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(output);
		System.setOut(ps);
		chicken.gender = Animal.Gender.MALE;
		chicken.sound();
		assertEquals("Cock-a-doodle-doo", output.toString().trim());
	}
	
	@AfterAll
	public static void destroy() {
		chicken = null;
	}
}
