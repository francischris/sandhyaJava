package loops;

public class StringLoops {


    public static void main(String[] args) {
        String str = "sdfsdfssdfsdfs  dtrgt fvnxd zxcvb    d vbcvb cbcvbc vbcweetr hnn";

        int counter = 0;
        for (int i = 0 ; i < str.length();i++){
            if(str.charAt(i)=='d'){
               counter++;
            }

        }

        System.out.println("number of d is "+counter);
    }
}
