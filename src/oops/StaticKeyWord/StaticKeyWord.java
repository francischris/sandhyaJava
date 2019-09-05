package oops.StaticKeyWord;

public class StaticKeyWord {


    public StaticKeyWord(){

    }

    public StaticKeyWord(int i){

    }

    public StaticKeyWord(String s){

    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        StaticKeyWord.age = age;
    }

    public int getUpperAge() {

        return upperAge;
    }

    public void setUpperAge(int upperAge) {
        this.upperAge = upperAge;
    }

    static int age= 18;
    int upperAge;


    static {
        System.out.println("I am a static block");
    }




}
