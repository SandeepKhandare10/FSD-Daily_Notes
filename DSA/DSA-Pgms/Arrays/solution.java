package Arrays;
import java.util.Scanner;
class Solution {
    public void sortColors(int[] nums) {

        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {
            switch (nums[mid]) {
                case 0:
                    swap(nums, low, mid);
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    // Swap nums[mid] and nums[high]
                    swap(nums, mid, high);
                    high--;
                    break;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the elements of the array (0, 1, or 2):");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        Solution sorter = new Solution();
        sorter.sortColors(nums);

        System.out.println("Sorted array:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}

