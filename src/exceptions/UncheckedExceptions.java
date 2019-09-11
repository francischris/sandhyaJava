package exceptions;

public class UncheckedExceptions {

    public static void main(String[] args) {

//        foo(null);

        String s = "Apple";
        System.out.println(s.charAt(10));

    }

    public static void foo(String s) {
        System.out.println(s.toLowerCase());
    }
}