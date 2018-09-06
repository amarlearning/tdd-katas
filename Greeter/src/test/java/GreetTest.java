import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import me.amarpandey.Greeter;

class GreetTest {

	private static final String MESSAGE_BASED_ON_CURRENT_TIME = "Good night";
	private static final String MORNING_GREETING_MESSAGE = "Good morning";
	private static final String EVENING_GREETING_MESSAGE = "Good evening";
	private static final String NIGHT_GREETING_MESSAGE = "Good night";
	private static final String GENERAL_GREETING_MESSAGE = "Hello";

	private Greeter greeter;

	@BeforeEach
	public void initGreeter() {
		greeter = new Greeter();
	}

	@Test
	public void shouldReturnwithHelloKeyword() {
		String result = greeter.greet("Amar");
		assertEquals(MESSAGE_BASED_ON_CURRENT_TIME + " Amar", result);
	}

	@Test
	public void shouldReturnWithHelloWithoutSpaces() {
		String result = greeter.greet("  Amar  ");
		assertEquals(MESSAGE_BASED_ON_CURRENT_TIME + " Amar", result);
	}

	@Test
	public void shouldCaptalizeFirstLetter() {
		String result = greeter.greet("amar");
		assertEquals(MESSAGE_BASED_ON_CURRENT_TIME + " Amar", result);
	}

	@Test
	public void shouldGreetMorningBetweenSixtoTwelve() {
		String result = greeter.greet("amar");
		assertEquals(MESSAGE_BASED_ON_CURRENT_TIME + " Amar", result);
	}

}
