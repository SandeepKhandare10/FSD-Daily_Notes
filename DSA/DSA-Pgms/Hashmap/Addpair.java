package Hashmap;

import java.util.HashSet;

public class Addpair {
    public static void main(String[] args) {
        int[] arr={0,10,11,6,4,5,3,2};
        int key=10;
        HashSet<Integer> ht =new HashSet<>();
        for (int i=0;i< arr.length;i++){

            int a=key-arr[i];
            if (ht.contains(a)){
                System.out.println(a+" "+arr[i]);
            }
            ht.add(arr[i]);
    }
    }
}
