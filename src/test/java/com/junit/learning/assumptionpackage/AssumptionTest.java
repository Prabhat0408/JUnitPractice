package com.junit.learning.assumptionpackage;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class AssumptionTest {

	@Test
    void testOnDev() 
    {
        System.setProperty("ENV", "DEV");
        Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV")));
        //remainder of test will proceed
    }
     
    @Test
    void testOnProd() 
    {
        System.setProperty("ENV", "PROD");
        Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV")), AssumptionTest::message);
        //remainder of test will be aborted
    }
     
    private static String message () {
        return "TEST Execution Failed :: ";
    }
}
