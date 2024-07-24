package PatternPrint;

public class CustomPattern {
    public static void main(String[] args) {
        // Define starting values and decrement values for each row
        int[][] patternInfo = {
                {10, -6},  // start at 10, next element is 10 - 6 = 4, then 4 - 1 = 3, etc.
                {9, -4},   // start at 9, next element is 9 - 4 = 5, then 5 - 3 = 2, etc.
                {8, -2},   // start at 8, next element is 8 - 2 = 6
                {7, 0}     // single element 7
        };

        // Iterate through each row
        for (int i = 0; i < patternInfo.length; i++) {
            int currentValue = patternInfo[i][0];  // Start value for the row
            int decrement = patternInfo[i][1];    // Decrement value for the row

            // Print the elements of the row
            while (currentValue > 0) {
                System.out.print(currentValue);
                // Calculate the next value
                currentValue -= decrement;

                // Adjust the decrement for the next iteration
                decrement = decrement == 0 ? 1 : decrement - 1;

                if (currentValue > 0) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
}

