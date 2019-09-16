package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets {


    public static void main(String[] args) {


        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Apple");
        hashSet.add("OPrange");
        hashSet.add("PineApple");
        hashSet.add("GreenApple");
        hashSet.add("REdApple");

        for(String s :hashSet){
            System.out.println(s);
        }

        System.out.println("*****************************");


        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("Apple");
        linkedHashSet.add("OPrange");
        linkedHashSet.add("PineApple");
        linkedHashSet.add("GreenApple");
        linkedHashSet.add("REdApple");

        for(String s :linkedHashSet){
            System.out.println(s);
        }

        System.out.println("*****************************");

        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("A");
        treeSet.add("A");
        treeSet.add("E");
        treeSet.add("C");
        treeSet.add("B");

        for(String s :treeSet){
            System.out.println(s);
        }

        System.out.println("*****************************");


        Iterator iter = treeSet.iterator();

        while (iter.hasNext()){
            System.out.println(iter.next());
        }

    }


}
