package loops;

public class Loops {


    public static void main(String[] args) {


        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");

        // For loop

        //for(initializer looper,condition,incrementor/decrementor){
        // tasks
        // }

        for(int i = 1; i <= 100 ; i+=2){
            System.out.println("value of i :"+i);
            if(i==48){
                break;
            }
        }

        for(int i = 100; i <=0 ; i--){
            System.out.println("value of i :"+i);
        }

        //infinite loop
        for( int i= 100; i >=0;i ++){
            System.out.println("value of i "+ i);
        }


        for (int i = 0 ; i <=100;i++){
            if(i /2 ==0){
                System.out.println( i +"is a even number");
            }else{
                System.out.println( i +"is a odd number");
            }

        }

        //while

         String a = "apple";
        while(a.contains("pp")){
            break;
        }

        //do while

        int xx = 234;
        do{
            System.out.println(xx++);
        }while(xx>0);

    }
}
