package methodss;

import org.testng.annotations.Test;

public class Calculator {


    public static void main(String[] args) {

        int result = additionAndReturnResult(62,92);

        division(result,2);
        subtraction(100,45);
        multiplication(2,90);

    }



    public static int additionAndReturnResult(int num1,int num2){
        subtraction(2,3);
        int result =num1+num2;
        return result;
    }

    public static void division(int num1,int num2 ){
        System.out.println(num1/num2);
    }

    public static void subtraction(int num1,int num2){
        System.out.println(num1-num2);
    }

    public static void multiplication(int num1,int num2){
        System.out.println(num1*num2);
    }

    public void finalize(){

    }


}
