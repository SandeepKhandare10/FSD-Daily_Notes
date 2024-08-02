package Hashmap;

import java.util.HashMap;

public class ArrEqual {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 5, 4, 0};
        int[] arr2 = {2, 4, 5, 0, 1};

        if (areArraysEqual(arr1, arr2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();

        for (int num : arr1) {
            map1.put(num, map1.getOrDefault(num, 0) + 1);
        }

        for (int num : arr2) {
            map2.put(num, map2.getOrDefault(num, 0) + 1);
        }

        return map1.equals(map2);
    }
}


