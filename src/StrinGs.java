public class StrinGs {

    public static void main(String[] args) {


        String str = "Hello";
        String wd = "sandhya";
        System.out.println(str+" "+wd);
        System.out.println(str.length()); // lenght
        System.out.println(wd.charAt(4)); // charAt
        char c = wd.charAt(3);
        System.out.println(wd.indexOf('h')); // index

        String str1 = "hello i am sandhya";
        System.out.println("index of z :"+str1.indexOf('l'));
        System.out.println(str1.indexOf('e',5));

        // replace

        String str2 = str1.replace('h','z');
        System.out.println(str2);
        str2 = str1.replace("sandhya","Francis");
        System.out.println(str2);

        str2 = str1.substring(7);
        System.out.println("substring :"+str2);
        str2 = str1.substring(9,11);
        System.out.println(str2);


        String s = "Hello";
        String a = "hello";
        System.out.println(s.equals(a));
        System.out.println(s.equalsIgnoreCase(a));






    }



}
