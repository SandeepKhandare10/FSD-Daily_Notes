package Searchingandsorting;

public class selectionsort {
    public static void main(String[] args) {
        int temp;
        int[] arr = {5, 8, 6, 9, 8, 4, 3, 2, 1, 12, 45, 69, 85, 45};
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
