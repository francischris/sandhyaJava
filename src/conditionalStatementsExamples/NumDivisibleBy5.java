package conditionalStatementsExamples;

// To check if the given number is divisible by 5

public class NumDivisibleBy5 {

    public static void main (String[] args) {

        int n = 148;
        if(n%5==0) {
            System.out.println("given number is divisible by 5");
        } else {
            System.out.println("given number is not divisible by 5");
        }
    }
}
