package dataTypes;

public class Conditionals {
    public static void main(String[] args) {

        //if else statement

        int x = 2332;
        int y =2352;
        int z = 100000;



        //simple if else
        if(x>y) {
            System.out.println("print x is greater");
        } else {
            System.out.println("print y is greater");
        }


        //simple if else if

        if(x==2434){
            System.out.println("print x 2434");
        }else if(x==2332){
            System.out.println("print x is 2332");
        }


        char c = 'e';

        if(c=='f'){
            System.out.println("its sunday");
        }else if(c=='g'){
            System.out.println("its monday");
        }else if(c=='h'){
            System.out.println("its dull day");
        } else{
            System.out.println("print nothing");
        }


        // nested if and else


        if(99>55){
            if(9/3==4){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }else{
            System.out.printf("first else");
        }


        int j = 150;
        if(j>100){
            if(j<160){
                if(j==150){
                    System.out.println("j is 456");
                }else{
                    System.out.println("j is not 456");
                }
                if(j<140){
                    System.out.println("I am in");
                }else if(j>140){
                    System.out.println("this is crazy");
                }else{
                    System.out.println("i am dead");
                }
            }else{
                System.out.println("i am out");
            }
        }else{
            System.out.println("exit");
        }





    }


}
