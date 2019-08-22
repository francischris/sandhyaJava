package dataTypes;

public class TypeConversion {

    public static void main(String[] args) {

        // Auto conversion BYTEShortintLongfloatdouble
        byte b = 3;
        int x = b;
        long l = x;
        long ll = b;


        float f = 3.14f;
        double d = f;

        int i = 234;
        float fl = i;
        System.out.println("integer :"+i);
        System.out.println("float :"+fl);


//        **************************************

//        Explicit Type Casting / Conversion

        //double to float
        double db = 123123.453445656343;
        fl = (float) db; // Type casting
        System.out.println("double after conversion : "+ fl);

        //long to int
        long lonNumber = 2343235l;
        int num = (int) lonNumber;
        System.out.println("long number after conversion : "+num);

        //float to int
        float flot = 2343.2343f;
        int id = (int) flot;
        System.out.println("float after conversion : "+id);


        // int to char
        int c = 97;
        char c1 = (char) c;
        System.out.println("integer to char :" +c1);

        //char to int
        char ch = 'r';
        int ascival = ch;
        System.out.println("char to integer :"+ascival);





    }


}
