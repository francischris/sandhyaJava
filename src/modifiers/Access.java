package modifiers;

public class Access {

    static float  pi = 3.14f;

    public static void main(String[] args) {

        int result = additionAndReturnResult(62,92);

        division(result,2);
        subtraction(100,45);
        multiplication(2,90);

    }



    public static int additionAndReturnResult(int num1,int num2){
        subtraction(2,3);
        int result =num1+num2;
        System.out.println(pi);
        return result;

    }

    public static void division(int num1,int num2 ){
        int x= 0;
        System.out.println(num1/num2);
    }

    public static void subtraction(int num1,int num2){
        System.out.println(num1-num2);
    }

    public static void multiplication(int num1,int num2){
        System.out.println(num1*num2);
    }





}
