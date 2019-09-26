package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Assertions {

    @Test
    public void testAsserts(){
        int x = 56;
        int y = 45;
        Assert.assertEquals(x,y,"X and y are not equal");
        Assert.assertTrue(x>y,"x is not greater than y");


    }

    @Test
    public void testSoftAsserts(){
        int x = 56;
        int y = 45;

//        SoftAssert softAssertion= new SoftAssert();

        Assert.assertEquals(x,y,"X and y are not equal");
        Assert.assertTrue(x>y,"x is not greater than y");


    }



}
