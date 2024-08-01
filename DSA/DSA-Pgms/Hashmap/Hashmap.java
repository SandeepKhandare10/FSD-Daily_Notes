package Hashmap;
import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    public static void main(String[] args) {
        HashMap <Integer, String> mp=new HashMap<>();
        mp.put(1,"asd");
        mp.put(11,"fgh");
        mp.put(10,"dsa");
        mp.put(15,"qwert");
        mp.put(18,"dsa");
        mp.put(16,"adsd");
        mp.remove(16);
        mp.put(null,null);
        System.out.println(mp);
        for (Integer hm:mp.keySet()){
            System.out.print(hm+" ");
        }
        System.out.println();

        for (String hm:mp.values()){
            System.out.print(hm+" ");
        }
        System.out.println();

        for (Map.Entry<Integer,String> hm:mp.entrySet()){
            System.out.print(hm.getKey()+" "+hm.getValue()+" ");
        }
    }
}
