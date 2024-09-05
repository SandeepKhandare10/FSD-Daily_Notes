package DP;

import java.util.HashMap;
import java.util.Map;

public class Fibomap {
    private static Map<Integer,Integer> map=new HashMap<>();
    static int Fib(int n){
       if (n<2){
           return n;
       }
       if (!map.containsKey(n)){
           map.put(n,Fib(n-2)+Fib(n-1));
       }
       return map.get(n);
    }
    public static void main(String[] args) {
        int n=13;
        System.out.println(Fib(n));
    }
}
