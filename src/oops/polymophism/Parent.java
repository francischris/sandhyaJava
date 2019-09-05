package oops.polymophism;

public class Parent {

    int totalCash = 500;
    int totalGold = 5;

    public void getParentsCash(){
        System.out.println("Give all cash : " + totalCash);

    }

    public void saveMoney(int money){
        System.out.println("Saved money");
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
