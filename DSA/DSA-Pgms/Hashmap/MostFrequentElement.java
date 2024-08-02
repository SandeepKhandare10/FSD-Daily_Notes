package Hashmap;

    import java.util.HashMap;

    public class MostFrequentElement {

        public static int findMostFrequentElement(int[] arr) {
            HashMap<Integer, Integer> frequencyMap = new HashMap<>();

            for (int num : arr) {
                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            }

            int mostFrequentElement = arr[0];
            int maxFrequency = 0;

            for (int key : frequencyMap.keySet()) {
                int frequency = frequencyMap.get(key);
                if (frequency > maxFrequency) {
                    maxFrequency = frequency;
                    mostFrequentElement = key;
                }
            }

            return mostFrequentElement;
        }

        public static void main(String[] args) {
            int[] arr1 = {1, 3, 2, 1, 4, 1};
            System.out.println("Most Frequent Element: " + findMostFrequentElement(arr1)); // Output: 1

            int[] arr2 = {10, 20, 10, 20, 30, 20, 20};
            System.out.println("Most Frequent Element: " + findMostFrequentElement(arr2)); // Output: 20
        }
    }


