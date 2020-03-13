//This class is  exaample of Parameterization without constructor @parameters

package com.junit.learning.parametrizetest;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import parametrized.Addition;

@RunWith(Parameterized.class)

public class Addition2Test {
	
	//Private variables
    //Variables using together with @Parameter must be public
	
	@Parameter(value =0)
	//or @Parameter(0)
	public int v1;
	@Parameter(value =1)
	public int v2;
	@Parameter(value =2)
	public int summation;
	

	//Creating test data
    @Parameters
    public static Collection<Object[]> data() {
        Object[][] dataValues = new Object[][] { { 4 , 3, 7 }, { 7, 8, 15 }, { 2, 9, 11} };
        return Arrays.asList(dataValues);
    }
    
    
    @Test
    public void testAddition() {
            Addition add = new Addition();
            assertEquals("Addition Failed!", summation, add.AddOperation(v1, v2));
            System.out.println("Test for " + v1 + " and " + v2 + " has been passed!\n");
    }
	

}
