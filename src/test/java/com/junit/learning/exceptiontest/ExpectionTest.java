package com.junit.learning.exceptiontest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class ExpectionTest {
	@Test
	void testExpectedException() {
	 
	  Assertions.assertThrows(NumberFormatException.class, () -> {
	    Integer.parseInt("One");
	  });
	 
	}
	
//Note: Please note that exception of same types are allowed.
//e.g. If you are expecting NumberFormatException
//and it throws IllegalArgumentException then also the test will PASS because NumberFormatException extends IllegalArgumentException class.
	@Test
	void testExpectedExceptionWithSuperClass() {
	 
	  Assertions.assertThrows(IllegalArgumentException.class, () -> {
	    Integer.parseInt("One");
	  });
	 
	}
	
	//Note as this method will not throw exception so it will be fail
	@Test
	void testExpectedExceptionFail() {
	 
	  Assertions.assertThrows(IllegalArgumentException.class, () -> {
	    Integer.parseInt("1");
	  });
	 
	}

}
