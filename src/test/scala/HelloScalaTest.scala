class HelloScalaTest{

	import org.junit.jupiter.api.Assertions.assertEquals
	import org.junit.jupiter.api.Test

	@Test
	def greetThroughJavaTest(): Unit = {
		val expectedGreeting = "hello scala"
		assertEquals(expectedGreeting,HelloScala.greetThroughJava(expectedGreeting)
	}	
}

