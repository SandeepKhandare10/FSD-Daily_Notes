package Hashmap;

import java.util.HashMap;
import java.util.Map;

public class FreqStr {
        public static void main(String[] args) {
            String str="Sandeep";
       char[] arr=str.toCharArray();
            Map<Character, Integer> mp=new HashMap<>();
            for (char i:str.toCharArray()){
                mp.put(i, mp.getOrDefault(i,0)+1);

            }
            for (Map.Entry<Character,Integer>e:mp.entrySet()){
                System.out.print(e.getKey()+"="+e.getValue()+" ");
            }
//            System.out.println(mp);
        }

    }


