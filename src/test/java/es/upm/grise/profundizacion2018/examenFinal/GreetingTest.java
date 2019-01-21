package es.upm.grise.profundizacion2018.examenFinal;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.never;

public class GreetingTest {
	private Calendar calendarTest = new MyCalendar();
	private Message messageToMock = mock(Message.class);


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
	
	@Test
	public void smokeTest4() {
		Greeting greeting = new Greeting(calendarTest, 8, messageToMock);

		greeting.getGreeting(null);
		
		verify(messageToMock).getDefaultLanguage();
		verify(messageToMock).getMessage(TimeOfTheDay.MORNING,Language.ENGLISH);
	}
	
	@Test
	public void smokeTest5() {
		Greeting greeting = new Greeting(calendarTest, 8, messageToMock);

		greeting.getGreeting(null);
		
		verify(messageToMock).getDefaultLanguage();
		verify(messageToMock,never()).getMessage(TimeOfTheDay.EVENING,Language.ENGLISH);
	}
	
	

	
	

}
