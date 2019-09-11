package exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.FileHandler;

public class CheckedException {


    public static void main(String[] args){


      trycatch();
      try {
          throwsHandling();
      }catch (Exception e){
          e.printStackTrace();
      }

        System.out.println(throwableHander("Sandhya","password1234"));


    }


    public static void trycatch(){


        File file = new File("C:\\Users\\pankaj\\Desktop\\test.txt");

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            Thread.sleep(4000);
        }catch (FileNotFoundException f){
            f.printStackTrace();
        }catch (InterruptedException i){
            i.printStackTrace();
        }


        System.out.println("My Name is Sandhya");
    }


    public static void throwsHandling() throws InterruptedException,FileNotFoundException{

        File file = new File("C:\\Users\\pankaj\\Desktop\\test.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        Thread.sleep(5000);
    }

    public static boolean throwableHander(String name,String password){

        boolean loggedIn = false;
        if(name.equalsIgnoreCase("Sandhya")&&password.equals("password123")){
            loggedIn = true;
        }else{
            loggedIn = false;
            throw new ArithmeticException("Something went wrong");
        }
        return loggedIn;

    }





}
