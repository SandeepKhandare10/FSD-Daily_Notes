package Arrays;
import java.util.Arrays;
public class SecondLargestEle {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 78, 99, 5, 9};

        Arrays.sort(arr);
        int largest = arr[arr.length - 1];
        int secondLargest = Integer.MIN_VALUE;

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] < largest) {
                secondLargest = arr[i];
                break;

            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("The second largest element is: " + secondLargest);
        }
    }
}

