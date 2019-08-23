package conditionalStatementsExamples;

// To find smallest number from the given numbers

public class findingSmallestNumber {

    public static void main(String[] args) {

        int i = 125;
        int j = 150;
        int k = 75;

        if(i<j && i<k) {
            System.out.println(" i is the smallest number");
        }else if(j<i && j<k) {
            System.out.println("j is the samllest number");
        }else {
            System.out.println("k is the smallest number");
        }

    }
}
