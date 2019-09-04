package oops.polymophism;

public class Parent {

    int totalCash = 500;
    int totalGold = 5;

    public String getParentsCash(){
        System.out.println("Give all cash : " + totalCash);
        return "hello";
    }

    public void getParentsCash(int value,String price){
        System.out.println("Give cash : " + value);
        int balance=totalCash-value;
        System.out.println("Balance : "+balance);
    }

    public void getParentsCash(int value,int gold){
        System.out.println("Give cash : " + value);
        int balance=totalCash-value;
        System.out.println("Balance : "+balance);
        System.out.println("give gold :"+gold);
        System.out.println("Balance : "+(totalGold-gold));
    }



}
