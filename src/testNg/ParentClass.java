package testNg;

import org.testng.annotations.*;

public class ParentClass {


    @BeforeClass
    public void inPArentClass(){
        System.out.println("parent class before class");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("in before suite");
    }


    @AfterClass
    public void afterSuite(){
        System.out.println("in after suite");
    }


    @BeforeTest
    public void beforeTest(){
        System.out.println("Inside before tests");
    }


    @AfterTest
    public void afterTest(){
        System.out.println("Inside after tests");
    }


}
