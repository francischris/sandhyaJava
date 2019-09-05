package oops.StaticKeyWord;

public class SomeClassA {


    public static void main(String[] args) {

        System.out.println(StaticKeyWord.age);
        StaticKeyWord.getAge();

        StaticKeyWord obj = new StaticKeyWord();
        obj.upperAge = 23;


        StaticKeyWord obj1 = new StaticKeyWord("23");
        obj1.upperAge = 323;





    }
}
