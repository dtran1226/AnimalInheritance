package com.example.animal;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestParrot {
	static Parrot parrot;
	@BeforeAll
	public static void init() {
		parrot = new Parrot();
	}
	
	@Test
	public void testSoundByCheckOutputOfRooster() {
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(output);
		System.setOut(ps);
		parrot.imitate = Parrot.Imitate.ROOSTER;
		parrot.sound();
		assertEquals("Cock-a-doodle-doo", output.toString().trim());
	}
	
	@Test
	public void testSoundByCheckOutputOfDog() {
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(output);
		System.setOut(ps);
		parrot.imitate = Parrot.Imitate.DOG;
		parrot.sound();
		assertEquals("Woof, woof", output.toString().trim());
	}
	
	@AfterAll
	public static void destroy() {
		parrot = null;
	}
}
