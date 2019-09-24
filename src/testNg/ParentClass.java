package testNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

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


}
