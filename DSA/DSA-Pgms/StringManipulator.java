import java.util.Scanner;

public class StringManipulator {

    // Method to reverse a string
    public String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // Method to capitalize a string
    public String capitalize(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }

    // Method to append a string
    public String append(String original, String toAppend) {
        return original + toAppend;
    }

    // Method to append a character
    public String append(String original, char toAppend) {
        return original + toAppend;
    }

    // Method to append an integer
    public String append(String original, int toAppend) {
        return original + toAppend;
    }

    public static void main(String[] args) {
        StringManipulator manipulator = new StringManipulator();
        Scanner scanner = new Scanner(System.in);

        // Test reverse method
        System.out.println("Enter a string to reverse:");
        String input = scanner.nextLine();
        System.out.println("Reversed string: " + manipulator.reverse(input));

        // Test capitalize method
        System.out.println("Enter a string to capitalize:");
        input = scanner.nextLine();
        System.out.println("Capitalized string: " + manipulator.capitalize(input));

        // Test append methods
        System.out.println("Enter the original string for appending:");
        String original = scanner.nextLine();

        System.out.println("Enter a string to append:");
        String toAppendString = scanner.nextLine();
        System.out.println("Appended string: " + manipulator.append(original, toAppendString));

        System.out.println("Enter a character to append:");
        char toAppendChar = scanner.next().charAt(0);
        System.out.println("Appended string: " + manipulator.append(original, toAppendChar));

        System.out.println("Enter an integer to append:");
        int toAppendInt = scanner.nextInt();
        System.out.println("Appended string: " + manipulator.append(original, toAppendInt));
        scanner.close();
    }
}
