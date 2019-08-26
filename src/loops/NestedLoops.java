package loops;

public class NestedLoops {


    public static void main(String[] args) {

        int x = 0;
        for(int i = 0; i <10 ; i++){
            System.out.println("outer loop");
            for(int j = 0 ; j<10 ; j++){
                System.out.println("inner loop");
                x++;
            }
        }

        System.out.println("total loop count" + x);



    }
}
