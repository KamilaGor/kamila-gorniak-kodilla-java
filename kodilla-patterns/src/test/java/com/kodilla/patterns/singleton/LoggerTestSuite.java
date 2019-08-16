package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LoggerTestSuite {

	@Before
	public void firstLog() { // czemu ta metoda nie może być statyczna ?
		Logger.getInstance().log("aaa");
	}
	@Test
	public void testGetLastLog() {
		//Given
		//When
		String lastLog = Logger.getInstance().getLastLog();
		System.out.println("Log1 " + lastLog);
		//Then
		Assert.assertEquals("aaa", lastLog);
	}
}
