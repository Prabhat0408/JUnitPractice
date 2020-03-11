//This class checking Paremeterizion with constructor

package parametrizetest;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import parametrized.Addition;

@RunWith(Parameterized.class)
public class AdditionTest {
	
	private int v1;
	private int v2;
	private int summation;
	
	
	public AdditionTest(int m1,int m2,int m3){
		this.v1= m1;
		this.v2 = m2;
		this.summation = m3;
	}
	
	//Creating test data
    @Parameters
    public static Collection<Object[]> data() {
        Object[][] dataValues = new Object[][] { { 4 , 3, 7 }, { 7, 8, 15 }, { 2, 9, 11} };
        return Arrays.asList(dataValues);
    }
    
  //Test addoperation method of class Addition
    @Test
    public void testAddition() {
            Addition add = new Addition();
            assertEquals("Addition Failed!", summation, add.AddOperation(v1, v2));
            System.out.println("Test for " + v1 + " and " + v2 + " has been passed!\n");
    }
 
	
	

}
