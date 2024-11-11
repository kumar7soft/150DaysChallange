package org.google.maps;

import java.util.HashMap;

public class HashMapComparision {

    public static void main(String[] args){
        HashMap<String, Integer> map1 = new HashMap<>();

        map1.put("A",10);
        map1.put("B",11);

        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("B",11);
        map2.put("A",10);

        System.out.println(map1.equals(map2));

    }
}
