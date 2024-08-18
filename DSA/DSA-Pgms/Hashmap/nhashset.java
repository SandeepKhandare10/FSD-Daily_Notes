package Hashmap;

import java.util.HashSet;
import java.util.Iterator;

public class nhashset {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();
        hs.add(10);
//        hs.add(20);
        hs.add(30);
        hs.add(40); 
        hs.add(20);
        System.out.println(hs);
//        hs.remove(10);
        if (!hs.contains(10)){
            System.out.println("set Does not contains this value");
        }
        else
            System.out.println("Set do contains this value");
        System.out.println(hs.contains(20));
        Iterator It= hs.iterator();
        while (It.hasNext()){
            System.out.println(It.next());
        }
    }
}
