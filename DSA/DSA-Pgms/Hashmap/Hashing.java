package Hashmap;

import java.util.HashMap;
import java.util.Map;

public class Hashing {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("India",140);
        map.put("China",152);
        map.put("UK",null);
        map.put("USA",80);
        System.out.println(map);
        for (Map.Entry<String,Integer>e:map.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}
