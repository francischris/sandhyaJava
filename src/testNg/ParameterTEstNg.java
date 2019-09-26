package testNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTEstNg {


//    @Parameters({ "username" ,"password"})
//    @Test
//    public void testSingleString(String username,String password) {
//        System.out.println("string from the testNg file " + username);
//        System.out.println("string from the testNg file " + password);
//
//    }




    @Test(dataProvider = "addition",dataProviderClass = DataProviders.class)
    public void addTwoNumbers(int a,int b){
        System.out.println(a+b);
    }



}
