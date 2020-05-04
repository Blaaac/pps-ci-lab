class HelloScalaTest{

	import org.junit.jupiter.api.Assertions.assertEquals
	import org.junit.jupiter.api.Test

	@Test
	def greetingsThroughJavaTest(): Unit = {
		val expectedGreeting = "hello scala"
		assertEquals(expectedGreeting,HelloScala.greetingsThroughJava(expectedGreeting))
	}
}

