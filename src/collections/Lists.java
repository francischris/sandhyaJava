package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class Lists {

    public static void main(String[] args) {


        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Apple");
        arrayList.add("Orange");
        arrayList.add("banana");
        arrayList.add("banana");
        arrayList.add("banana");
        arrayList.add("banana");
        arrayList.add("Apple");
        arrayList.add("banana");

//        System.out.println(arrayList.get(3));

        for (int i =0;i < arrayList.size();i ++){
            System.out.println(arrayList.get(i));
        }

        for(String value:arrayList){
            System.out.println(value);
        }

        System.out.println("****************************************");

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(345);
        linkedList.add(245);
        linkedList.add(335);
        linkedList.add(445);

        for(int i: linkedList){
            System.out.println(i);
        }

        System.out.println(arrayList.contains("banana"));

        System.out.println(arrayList.indexOf("banana"));
        System.out.println(arrayList.lastIndexOf("banana"));


        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);

        ArrayList<Integer> b = new ArrayList<>();
        b.add(1);
        b.add(2);
        b.add(3);


        System.out.println(b.containsAll(a));

        a.equals(b);

        a.addAll(b);

        for(int x:a){
            System.out.println(x);
        }

        a.removeAll(b);









    }



}
