package Web_Hello.demo;

import Web_Hello.demo.controller.HelloController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class WebHelloApplicationTests
{
	@Test
	void contextLoads()
	{

	}
	@Test
	public void testHello() {
		String expected = "Hello, world";
		String actual = HelloController.hello();
		assertEquals(expected, actual);
	}
}
