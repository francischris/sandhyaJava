package arrays;

public class OneDimensonArrays {

    public static void main(String[] args) {



        // initializing array
        int intAray[];
        intAray = new int[5];
        int[] intArray = new int[5];

        intAray[0]=1;
        intAray[3]=32;
        intAray[4]=13;
        intAray[1]=34;
        intAray[2]=35;






//        System.out.println( intAray[0]);
//        System.out.println( intAray[1]);
//        System.out.println( intAray[2]);
//        System.out.println( intAray[3]);
//        System.out.println( intAray[4]);

//        for (int i=0;i<intAray.length;i++){
//            System.out.println("the value of "+i+" th index is "+ intAray[i]);
//        }


        String [] myFruits = {"apple","orange","banana","kiwi","pineapple"};

//
//        for (int i=0;i<myFruits.length;i++){
//            System.out.println("the value of "+i+" th index is "+ myFruits[i]);
//        }


        for(int i = myFruits.length-1 ; i >=0 ; i--){
            System.out.println(myFruits[i]);
        }












    }



}
