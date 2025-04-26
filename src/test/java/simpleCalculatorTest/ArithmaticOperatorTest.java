package simpleCalculatorTest;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.Test;
import simpleCalculator.ArithmaticOperator;

public class ArithmaticOperatorTest {

    SoftAssert softAssert = new SoftAssert();

    @Test
    public void testSum(){
        System.out.println("****************01st Test case for cal Sum*****************");
        System.out.println("<<<<<<<<<<<<<<<<First sum calculation>>>>>>>>>>>>>>>>>");
        int actualValueSum1 = ArithmaticOperator.calSum(20, 5);
        System.out.println("Actual Sum 1 value is : " + actualValueSum1);
        softAssert.assertEquals(actualValueSum1,25,"Failed to calc sum 1");

        System.out.println("<<<<<<<<<<<<<<<<Second sum calculation>>>>>>>>>>>>>>>>>");
        int actualValueSum2 = ArithmaticOperator.calSum(10, 20);
        System.out.println("Actual Sum 2 value is : " + actualValueSum2);
        softAssert.assertEquals(actualValueSum2,30,"Failed to calc sum 2");

        System.out.println("<<<<<<<<<<<<<<<<Third sum calculation>>>>>>>>>>>>>>>>>");
        int actualValueSum3 = ArithmaticOperator.calSum(4, 8);
        System.out.println("Actual Sum 3 value is : " + actualValueSum3);
        softAssert.assertEquals(actualValueSum3,12,"Failed to calc sum 3");
        System.out.println();
        System.out.println();
        softAssert.assertAll();  // Softassert wala excetion eka trouh krnna use we anthima line eka wenakm print wenna use we
    }

    @Test(priority = 1)
    public void testSubtraction(){
        System.out.println("****************02nd Test case for cal Subtraction*****************");
        System.out.println("<<<<<<<<<<<<<<<<First Subtraction calculation>>>>>>>>>>>>>>>>>");
        int actualValueSubtraction1 = ArithmaticOperator.calSubTransction(20, 5);
        System.out.println("Actual Subtraction 1 value is : " + actualValueSubtraction1);
        Assert.assertEquals(actualValueSubtraction1,15,"Failed to calc Subtraction 1");

        System.out.println("<<<<<<<<<<<<<<<<Second Subtraction calculation>>>>>>>>>>>>>>>>>");
        int actualValueSubtraction2 = ArithmaticOperator.calSubTransction(30, 5);
        System.out.println("Actual Subtraction 2 value is : " + actualValueSubtraction2);
        Assert.assertEquals(actualValueSubtraction2,25,"Failed to calc Subtraction 2");
    }
}

