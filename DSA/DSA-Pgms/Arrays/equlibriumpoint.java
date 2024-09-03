package Arrays;

public class equlibriumpoint {
    public static void main(String[] args) {
        int[] arr = {5, 3, -1, 8, 4};

        int equilibriumIndex = findEquilibriumPoint(arr);
        if (equilibriumIndex != -1) {
            System.out.println("Equilibrium point found at index: " + equilibriumIndex);
        } else {
            System.out.println("No equilibrium point found.");
        }
    }

    public static int findEquilibriumPoint(int[] arr) {
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }

        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum -= arr[i];  // totalSum now represents the right sum for index i

            if (leftSum == totalSum) {
                return i;
            }

            leftSum += arr[i];
        }

        return -1;
    }
}
