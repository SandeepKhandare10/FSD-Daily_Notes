package Arrays;
import java.util.Scanner;
//public class RemoveElements {
//    public int removeElement ( int[] nums, int val){
//        int index = 0;
//        for (int i=0;i<nums.length;i++) {
//            if (nums[i] != val) {
//                nums[index] = nums[i];
//                index++;
//            }
//        }
//        return index;
//    }
//    public static void main(String[] args) {
//
//    }
//
//}
class RemoveElements {

    public int removeElement(int[] nums, int val) {
        int index = 0; // Initialize index to keep track of the position to place non-val elements
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        RemoveElements solution = new RemoveElements();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.print("Enter the value to remove: ");
        int val = scanner.nextInt();

        int k = solution.removeElement(nums, val);
        System.out.println("New length of the array: " + k);
        System.out.print("Array after removal: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

