package Arrays;

import java.util.Arrays;

public class arrlargestEle {
    public static void main(String[] args) {
        int[] arr = {5,1,1,2,0,0};
        int temp;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        // Calculate the sum of the array elements and find the maximum value
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Sort the array
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Maximum value in the array: " + max);
        System.out.println("Sum of array elements: " + sum);
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
