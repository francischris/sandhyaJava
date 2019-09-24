package testNg;

import oops.polymophism.Parent;
import org.testng.annotations.*;

public class TestNg extends ParentClass {


    @BeforeClass(alwaysRun = true)
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

    @Test(enabled = false)
    public void testOne(){

        System.out.println("My test one");
    }

    @Test(dependsOnMethods = "testFours")
    public void testTwo(){
        System.out.println("My test two");
    }


    @Test(groups = "sanity")
    public void testThree(){
        System.out.println("My test three");
    }


    @Test(groups = "sanity")
    public void testFours(){
        System.out.println("My test four");
    }


    @Test(groups = "sanity")
    public void testFive(){
        System.out.println("My test five");
    }

    @Test(dependsOnGroups = "sanity",description="This is a test to explain groups")
    public void runGroupBy(){
        System.out.println("run by groups");
    }



}
