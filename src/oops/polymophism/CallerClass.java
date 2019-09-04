package oops.polymophism;

public class CallerClass {


    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.getParentsCash();
        parent.getParentsCash(45,"Hello");
        parent.getParentsCash(45,2);

    }

}
