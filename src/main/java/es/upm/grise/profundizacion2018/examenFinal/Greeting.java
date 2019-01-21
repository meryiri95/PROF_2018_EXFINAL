package es.upm.grise.profundizacion2018.examenFinal;

import java.util.Calendar;

public class Greeting {
	
	private Calendar calendar;
	private int hour;
	private Message message=null;
	
	Greeting() {
		// Get current hour
		calendar = Calendar.getInstance();
		hour = calendar.get( Calendar.HOUR_OF_DAY );
		
	}
	Greeting(Calendar calendarTest, int hourTest) {
		calendar = calendarTest;
		//calendar.set(Calendar.HOUR, hour);
		hour = hourTest;
	}
	Greeting(Calendar calendarTest, int hourTest,Message messageT) {
		calendar = calendarTest;
		//calendar.set(Calendar.HOUR, hour);
		hour = hourTest;
		message= messageT;
	}
	
	
	public String getGreeting( Language language ) {
		
		
		
		// Find out the greeting language
		if ( language == null )
			language = Message.getDefaultLanguage();
		
		// Get the moment of the day
		TimeOfTheDay moment;
		if( hour < 12 ) 
			moment = TimeOfTheDay.MORNING;
		else if ( hour < 18 )
			moment = TimeOfTheDay.AFTERNOON;
		else
			moment = TimeOfTheDay.EVENING;
			
		// Return the message		
			return message.getMessage(moment, language);
	}

}
