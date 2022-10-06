package sample.actuator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloWorldServiceTest {

	Boolean tested = false;



	@Test
	public void expectedMessage() {
		HelloWorldService helloWorldService = new HelloWorldService();
		assertEquals("Expected correct message","Springgg boot says hello from a Docker container",helloWorldService.getHelloMessage());
	}

	@Test
	public void printHelloMessage(){
		for (int i = 0; i < 4; i++){
			System.out.println(getHelloMessage());
		}
	}

	public String getHelloMessage() {
		String helloMessage;
		if (tested){
			helloMessage = helloHello();
		}else {
			helloMessage = holaHola();
		}
		tested = !tested;
		return helloMessage;
	}

	public String helloHello() {
		return "Hello Hello";
	}

	public String holaHola() {
		return "Hola Hola";
	}
	
}
