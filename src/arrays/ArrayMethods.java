package arrays;

public class ArrayMethods {

    public static void main(String[] args) {


        String [] myFruits = {"apple","orange","banana","kiwi","pineapple"};
        String [] copyMyFruit = myFruits.clone();

        int[] intArray = new int[5];

        intArray[0]=1;
        intArray[3]=32;
        intArray[4]=13;
        intArray[1]=34;
        intArray[2]=35;


//        for(int i = 0 ; i < intArray.length ; i ++){
//            System.out.println(intArray[i]);
//        }

        for(String values : copyMyFruit){
            System.out.println(values);
        }


    }


}
