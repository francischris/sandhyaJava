package oops.polymophism;

public class CallerClass {


    public static void main(String[] args) {
//        Parent parent = new Parent();
//        parent.getParentsCash();
//        parent.getParentsCash(45,"Hello");
//        parent.getParentsCash(45,2);


        Son son = new Son();
        son.getCashFromParents();
        son.saveMoney(23);


        Daughter daughter = new Daughter();
        daughter.getCashFromParents();
        daughter.saveMoney(45);
    }

}
