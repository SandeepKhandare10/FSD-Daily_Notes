package Hashmap;

import java.util.Hashtable;
import java.util.Map;

public class hashtable {
    public static void main(String[] args) {
        Hashtable <Integer, String> ht=new Hashtable<>();
        ht.put(10,"asd");
        ht.put(0,"abc");
        ht.put(11,"gfh");
        ht.put(12,"nbv");
        ht.put(1,"lkj");
//        ht.remove(11);
//        System.out.println(ht.size());
//        System.out.println(ht.containsKey(10));
//        System.out.println(ht.containsValue("abc"));
//        System.out.println(ht.put(10,""));
//        System.out.println(ht);
        int[] arr={10,12,56,69,699,555};
//        for ( int pt: ht.keySet()){
//            System.out.print(pt+ " "+ht.get(pt)+" ");
//        }
//        System.out.println();
        for (int pt:ht.keySet()){
            System.out.print(pt+" ");
        }
        System.out.println();
        for (String pt:ht.values()){
            System.out.print(pt+" ");
        }
        System.out.println();
        for (Map.Entry<Integer,String> pt:ht.entrySet()){
            System.out.print(pt.getKey()+" "+pt.getValue() + " ");
        }
    }


}
