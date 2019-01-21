package es.upm.grise.profundizacion2018.examenFinal;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Test;

public class GreetingTest {
	Calendar calendarTest = new MyCalendar();

	@Test
	public void smokeTest1() {
		Greeting greeting = new Greeting(8);

		assertEquals("Good morning", greeting.getGreeting(null));
	}
	
	@Test
	public void smokeTest2() {
		Greeting greeting = new Greeting(8);
		assertEquals("Good morning", greeting.getGreeting(Language.ENGLISH));
	}
	
	@Test
	public void smokeTest3() {
		Greeting greeting = new Greeting(8);
		assertEquals("Buenos días", greeting.getGreeting(Language.SPANISH));
	}

}
