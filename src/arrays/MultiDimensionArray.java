package arrays;

public class MultiDimensionArray {


    public static void main(String[] args) {

        int [][] arr = new int[2][3];

        arr[0][0] = 00;
        arr[0][1] = 01;
        arr[0][2] = 02;
        arr[1][0] = 10;
        arr[1][1] = 11;
        arr[1][2] = 12;



        int rowLenght = arr.length;
        int colmnLength = arr[0].length;
        System.out.println("number of rows :"  +rowLenght);
        System.out.println("number of columns :" +colmnLength);

        for(int r = 0 ; r < rowLenght ; r++){
            for(int col = 0 ; col < colmnLength; col ++){
                System.out.println(arr[r][col]);
            }

        }











    }



}
