package oops.polymophism;

public class Daughter extends Parent{

    public void getCashFromParents(){
        getParentsCash();

    }

    public void saveMoney(int money){
        super.saveMoney(23);
        System.out.println("Saved money by daughter");
    }

}
