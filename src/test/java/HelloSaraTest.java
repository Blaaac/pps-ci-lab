import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class HelloSaraTest{

	@Test
	public void greetingTest(){
		String expectedGreeting = "hello sara";
		HelloSara hs = new HelloSara(expectedGreeting);
		actualGreeting = hs.greet();
		assertEquals(expectedGreeting, actualGreeting);
	}
}
