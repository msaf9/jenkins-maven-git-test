package com.jenkins.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MessageTest extends Message {
	Message message;

	@Before
	public void setup() {
		message = new Message();
	}

	@Test
	public void testMessage() {
		String expected = "Hello Alex!";
		String actual = message.Print("Alex");
		assertEquals(expected, actual);
	}
}
