package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AnnotationTest {

    SoftAssert softAssert = new SoftAssert();
    String actualValue = "Supun";

    @Test(priority = 0)
    private void ValueCheck() {
        String expertValue = "Supun12";
        System.out.println("Prior to valuesEqualCheck assertion");
       // Assert.assertEquals(actualValue, expertValue);             // HARD ASSERTION
        softAssert.assertEquals(actualValue, expertValue, "Values miss matched");  // == soft assertion
        System.out.println("After valuesEqualCheck assertion");
        softAssert.assertAll();
    }

    @Test(priority = 1)
    public void valuesNotEqualCheck() {
        String expectedValue = " HI hi ";
        System.out.println("Prior to valuesNotEqualCheck assertion");
        Assert.assertNotEquals(actualValue, expectedValue);               // ---- HARD ASSERTION
       // softAssert.assertNotEquals(actualValue, expectedValue, "values matched");  // == soft assertion
        System.out.println("After to valuesNotEqualCheck assertion");

    }

    @Test(priority = 2)
    public void trueConditionCheck() {
        System.out.println("Prior to trueConditionCheck assertion");
      //  Assert.assertTrue(actualValue.startsWith("Supun12"));                       //---- HARD ASSERTION
        softAssert.assertTrue(actualValue.startsWith("H"), "Condition Return a False");  // == soft assertion
        System.out.println("After to trueConditionCheck assertion");

    }

    @Test(priority = 3)
    public void falseConditionCheck() {
        System.out.println("Prior to falseConditionCheck assertion");
     //   Assert.assertFalse(actualValue.isBlank(),("Condition Return Ture"));                            //----- HARD ASSERTION
        softAssert.assertFalse(actualValue.isBlank(), "Condition Return a True");   // == soft assertion
        System.out.println("After to falseConditionCheck assertion");
    }
}