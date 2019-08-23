package conditionalStatementsExamples;

// To find if a number is divisible by 3 and if it is even and if it is prime

public class Divisibleby3AndEvenAndPrime {

    public static void main(String[] args){

        int i = 9;
        if(i%3 == 0 && i%2 ==0 && i%1==0 && i%i ==0) {
            System.out.println("given number is divisible by 3 and even and prime number");

            }else {
            System.out.println("given number is not divisible by 3 and even and prime number");

        }

    }
}
