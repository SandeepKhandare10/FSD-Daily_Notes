package Searchingandsorting;

public class Bubblesort {
    public static void main(String[] args) {
        int temp = 0;
        int[] arr = {5, 8, 6, 9, 8, 5, 3, 2, 1, 12, 45, 69, 85, 45};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
