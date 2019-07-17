package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
	@Test
	public void testCalculations() {
		//Given
		ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
		Calculator calculator = context.getBean(Calculator.class);
		//When
		double result = calculator.add(4, 6);
		double result1 = calculator.sub(6, 4);
		double result2 = calculator.mul(4, 6);
		double result3 = calculator.div(10, 2);
		//Then
		Assert.assertEquals(10, result, 0.1);
		Assert.assertEquals(2, result1, 0.1);
		Assert.assertEquals(24, result2, 0.1);
		Assert.assertEquals(5, result3, 0.1);
	}
}
