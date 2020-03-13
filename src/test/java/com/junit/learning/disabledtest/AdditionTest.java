package com.junit.learning.disabledtest;

//repeat test with repeated annotation

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.runner.RunWith;
import org.junit.platform.runner.JUnitPlatform;

import parametrized.Addition;

@RunWith(JUnitPlatform.class)

public class AdditionTest {
	
	 @BeforeAll
	    public static void init(){
	        System.out.println("Before All init() method called");
	       
	    }
	     
  @BeforeEach
  public void initEach(){
      System.out.println("Before Each initEach() method called");   
  }
	 
	@Disabled("Basically disable the test choose over en browser file xtra")
	@DisplayName("Add operation test")
	//@RepeatedTest(5)
	
	//Displaying test name
	//@RepeatedTest(value = 5, name = "{displayName} - repetition {currentRepetition} of {totalRepetitions}")
	
	//Placing long and short name for current test RealetedTest is class hving different method
	@RepeatedTest(value =5, name= RepeatedTest.LONG_DISPLAY_NAME)
	//TestInfo is used to inject information about the current test or container into to @Test, @BeforeEach, @AfterEach, @BeforeAll, and @AfterAll methods.
	public void addNumber(TestInfo testInfo,RepetitionInfo repetitionInfo) {
		System.out.println("Repetition number:" + repetitionInfo.getCurrentRepetition());
		System.out.println("Repetition number:" + repetitionInfo.getTotalRepetitions());
		Addition add = new Addition();
		System.out.println(testInfo);
	    Assertions.assertEquals(2, add.AddOperation(1, 1), "1 + 1 should equal 2");
	}
	
	//Note Above method is diabled and using repeated and test in 1 class
	@Test()
	public void disablesExample() {
		Addition add = new Addition();
		//System.out.println(testInfo);
	    Assertions.assertEquals(2, add.AddOperation(1, 1), "1 + 1 should equal 2");
		
	}
	
	
	@AfterEach
  public void cleanUpEach(){
      System.out.println("After Each cleanUpEach() method called");
     
  }
   
  @AfterAll
  public static void cleanUp(){
      System.out.println("After All cleanUp() method called");
  }

}

