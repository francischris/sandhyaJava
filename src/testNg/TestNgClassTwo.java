package testNg;

import org.testng.annotations.*;

public class TestNgClassTwo {


    @BeforeClass
    public void inBeforeClass(){
        System.out.println("In before class");
    }

    @AfterClass
    public void inAfterClass(){
        System.out.println("In After class");
    }

    @BeforeMethod
    public void setUp(){
        System.out.println("In before method");
    }

    @AfterMethod
    public void TearDown(){
        System.out.println("In After method");
    }

    @Test(priority = 1,alwaysRun = false)
    public void testOne(){

        System.out.println("My test one");
    }

    @Test(priority = 200, timeOut = 5000l)
    public void testTwo() throws InterruptedException {
        System.out.println("My test two");
//        Thread.sleep(6000l);
    }


    @Test(priority =-1)
    public void testThree(){
        System.out.println("My test three");
    }


    @Test(priority = 4)
    public void testFours(){
        System.out.println("My test four");
    }


    @Test(priority = 5)
    public void testFive(){
        System.out.println("My test five");
    }



}
