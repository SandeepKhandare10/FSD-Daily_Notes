package Greedy;

import java.util.ArrayList;
import java.util.Arrays;

public class Greedy {
    public static void main(String[] args) {
        int[] arr = {500, 100, 50, 10, 20, 5, 200,2, 1};
        Arrays.sort(arr);
        ArrayList<Integer> coins = new ArrayList<>();
        int target = 245;
        int count = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            while (target >= arr[i]) {
                target -= arr[i];
                count++;
                coins.add(arr[i]);
            }
        }

        System.out.println("Coins used to make " + (245 - target) + ": " + coins);
        System.out.println(count);
    }
}
