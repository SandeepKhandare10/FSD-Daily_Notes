package Hashmap;
import java.util.HashMap;
public class PairSum {

        public static String findPair(int[] arr, int k) {

            HashMap<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < arr.length; i++) {
                int complement = k - arr[i];

                if (map.containsKey(complement)) {
                    return "Yes";
                }

                map.put(arr[i], i);
            }

            return "No";
        }

        public static void main(String[] args) {
            int[] arr1 = {0, -1, 2, -3, 1};
            int k1 = -2;
            System.out.println("Output: " + findPair(arr1, k1)); // Output: Yes

            int[] arr2 = {1, -2, 1, 0, 5};
            int k2 = 0;
            System.out.println("Output: " + findPair(arr2, k2)); // Output: No
        }
    }


