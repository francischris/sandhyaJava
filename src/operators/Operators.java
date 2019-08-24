package operators;

public class Operators {

    public static void main(String[] args) {

        // Logical ops
        // && -- and || -- or

//        char c = 's';
//
//        //AND operator checks for both conditions
//        if(c=='a' && c == 's'){
//            System.out.println("inside");
//        }else{
//            System.out.println("In else");
//        }
//
//        //OR operator check for either of the condition
//
//        if(c=='a' || c == 's'){
//            System.out.println("inside");
//        }else{
//            System.out.println("In else");
//        }
//
//        int x = 8;
//
//        if(x/2 == 0 && x*2==3 || x/4==2){
//            System.out.println("inside");
//        }else{
//            System.out.println("out");
//        }


        //Unary Operator

        int i =10;
       int x = ++i; //prefix
        System.out.println(x);
        x = i++; //suffix
        System.out.println("x :"+x);
        System.out.println("i :"+i);

        int y = 10;
        int z = --y; //prefix
        System.out.println(z);
        z = y--; // suffix
        System.out.println(z);


        // Ternary Operator

        int a = 223;
        int b = 34;
        int c = (a>b)?a:b;

        System.out.println(c);


        //Assignment operators


    }


}
