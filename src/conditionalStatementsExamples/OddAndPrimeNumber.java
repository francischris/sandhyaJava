package conditionalStatementsExamples;

// to check if the given number is odd and prime number

public class OddAndPrimeNumber {

    public static void main (String[] args) {

        int i = 2;

        if(i%2 != 0 && i%1 == 0 && i%i == 0) {
                System.out.println("given number is odd and prime number");
            }else {
                System.out.println("given number is not odd and prime number");
            }
    }
}
