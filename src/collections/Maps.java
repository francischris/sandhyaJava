package collections;

import java.util.*;

public class Maps {

    public static void main(String[] args) {


        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Sandhya",1);
        hashMap.put("francis",2);
        hashMap.put("Joker",3);
        hashMap.put("Batman",4);

        System.out.println("_____________________________________________");


//        System.out.println(hashMap.get("francis"));
//
//        System.out.println(hashMap);

        for(Map.Entry<String,Integer> entry: hashMap.entrySet() ){
            System.out.println(entry.getKey() +" :: "+entry.getValue());
        }

        System.out.println("_____________________________________________");

        hashMap.containsKey("sandhya");
        hashMap.containsValue(2);
        Set<String> keys = hashMap.keySet();

        LinkedHashMap<String,Integer> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put("Sandhya",1);
        linkedHashMap.put("francis",2);
        linkedHashMap.put("Joker",3);
        linkedHashMap.put("Batman",4);
        linkedHashMap.put(null,8);

        for(Map.Entry<String,Integer> entry: linkedHashMap.entrySet() ){
            System.out.println(entry.getKey() +" :: "+entry.getValue());
        }

        System.out.println("_____________________________________________");

        TreeMap<String,Integer> treeMap = new TreeMap(hashMap);

        for(Map.Entry<String,Integer> entry: treeMap.entrySet() ){
            System.out.println(entry.getKey() +" :: "+entry.getValue());
        }


        HashMap<Integer,Set<String>> mapOfMap = new HashMap();

        for(Map.Entry<Integer,Set<String>> entry: mapOfMap.entrySet() ){
            System.out.println(entry.getKey() +" :: "+entry.getValue());
            Iterator  iterator = entry.getValue().iterator();

            while(iterator.hasNext()){
                System.out.println(iterator.next());
            }


        }




    }


}
