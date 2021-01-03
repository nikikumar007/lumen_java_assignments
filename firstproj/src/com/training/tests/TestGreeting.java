package com.training.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.training.Greeting;

class TestGreeting {
private Greeting grtObj;
@BeforeEach
public void beforeTestMethod()
{
	grtObj=new Greeting();
}

//	@Test
//	@DisplayName(value="Test if return value is Heelo World")
//	void testForReturnValue() {
//		String expected="Hello World";
//		String actual=grtObj.getMessage();
//		assertEquals(expected, actual);
//	}
	
	@ParameterizedTest
	@ValueSource(ints= {2,3})
	void testGetNameForNull(int indxPos)
	{
		LocalDate today=LocalDate.now();
		assumeTrue(today.getDayOfWeek().getValue()==2);
		assertNotNull(grtObj.getNames().get(indxPos));
	}

}
