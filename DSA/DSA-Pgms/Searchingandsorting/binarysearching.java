package Searchingandsorting;

import java.util.Arrays;
import java.util.Scanner;

public class binarysearching {
    static boolean searchele(int key) {
        int[] arr = {5, 8, 6, 9, 8, 4, 3, 2, 1, 12, 45, 69, 85, 45};
        Arrays.sort(arr);
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                return true;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(searchele(86));
    }
}
