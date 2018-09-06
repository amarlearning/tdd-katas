package me.amarpandey;

import java.time.LocalTime;

public class Greeter {

	public String greet(final String name) {

		String prefix = null;
		int currentSystemHour = fetchCurrentSystemHour();
		String alteredName = makeFirstLetterCaptalize(name.trim());

		prefix = fetchGreetingMessageBasedOnHour(currentSystemHour);

		return (prefix + " " + alteredName);

	}

	private String fetchGreetingMessageBasedOnHour(int currentSystemHour) {

		String prefix = null;

		if (currentSystemHour >= 6 && currentSystemHour <= 12) {
			prefix = "Good morning";
		} else if (currentSystemHour > 12 && currentSystemHour <= 18) {
			prefix = "Hello";
		} else if (currentSystemHour > 18 && currentSystemHour <= 22) {
			prefix = "Good evening";
		} else {
			prefix = "Good night";
		}

		return prefix;
	}

	private int fetchCurrentSystemHour() {
		return LocalTime.now().getHour();
	}

	private String makeFirstLetterCaptalize(String alteredName) {
		return alteredName.substring(0, 1).toUpperCase() + alteredName.substring(1).toLowerCase();
	}

}
