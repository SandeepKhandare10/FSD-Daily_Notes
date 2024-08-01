package Hashmap;
import java.util.*;
public class friqentnum {
    public static void main(String[] args) {
        int[]arr={10,20,30,20,20,10,20};

        HashMap <Integer, Integer> mp=new HashMap<>();
        for (int i=0;i<arr.length;i++){
            if (mp.containsKey(arr[i])){
                int freq= mp.get(arr[i]);
                freq++;
                mp.put(arr[i],freq);

            }else {
                mp.put(arr[i],1);
            }
        }
        int max=0, res=-1;
//        for (Integer a: mp.values()){
//            if (a>max){
//                max=a;
//            }
//        }
        for (Map.Entry<Integer,Integer> hmt:mp.entrySet()){
            if (hmt.getValue()>max){
                max=hmt.getValue();
                res= hmt.getKey();
            }

        }
        System.out.println(max);
        System.out.println(res);
    }

}
