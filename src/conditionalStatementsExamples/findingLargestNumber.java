package conditionalStatementsExamples;

// To find largest number from given numbers

public class findingLargestNumber {

    public static void main(String[] args) {

        int i = 5;
        int j = 97;
        int k = 25;

        if(i>j && i>k) {
            System.out.println("i is the largest number");
        }else if (j>i && j>k) {
            System.out.println("j is the largest number");
        }else {
            System.out.println("k is the largest number");
        }
    }
}
