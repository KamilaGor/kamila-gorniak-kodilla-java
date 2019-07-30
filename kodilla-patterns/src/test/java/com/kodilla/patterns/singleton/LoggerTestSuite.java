package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LoggerTestSuite {
	private static Logger logger;
	@Before
	public void firstLog() { // czemu ta metoda nie może być statyczna ?
		logger = new Logger();
		logger.log("aaa");
	}
	@Test
	public void testGetLastLog() {
		//Given
		//When
		String lastLog = logger.getLastLog();
		System.out.println("Log1 " + lastLog);
		//Then
		Assert.assertEquals("aaa", lastLog);
	}
}
