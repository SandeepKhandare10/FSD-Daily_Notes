package Hashmap;

import java.util.HashSet;
import java.util.*;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();
        hs.add(10);
        hs.add(11);
        hs.add(12);
        hs.add(13);
        hs.add(10);
//        hs.add(null);
        System.out.println(hs.contains(10));
        System.out.println(hs +" ");
        System.out.println(hs.size());
        for (int st:hs){
            System.out.print(st+" ");
        }
    }
}
