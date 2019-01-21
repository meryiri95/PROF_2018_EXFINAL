package es.upm.grise.profundizacion2018.examenFinal;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.Calendar;

import org.junit.Test;

public class GreetingTest {
	Calendar calendarTest = new MyCalendar();
	private MyCalendar calendar = mock(MyCalendar.class);

	@Test
	public void smokeTest1() {
		Greeting greeting = new Greeting(calendarTest, 8);
		assertEquals("Good morning", greeting.getGreeting(null));
	}
	
	@Test
	public void smokeTest2() {
		Greeting greeting = new Greeting(calendarTest,8);
		assertEquals("Good morning", greeting.getGreeting(Language.ENGLISH));
	}
	
	@Test
	public void smokeTest3() {
		Greeting greeting = new Greeting(calendarTest,8);
		assertEquals("Buenos días", greeting.getGreeting(Language.SPANISH));
	}

}
