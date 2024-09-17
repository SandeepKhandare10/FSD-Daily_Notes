package Arrays;
import java.util.Scanner;
public class ElePresent2Darr { 

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            int rows = scanner.nextInt(); 

            int cols = scanner.nextInt();

            String[][] array = new String[rows][cols];

            scanner.nextLine();
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    array[i][j] = scanner.next();
                }
            }

            String searchValue = scanner.next();

            boolean found = false;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (array[i][j].equals(searchValue)) {
                        found = true;
                        break;
                    }
                }
                if (found) {
                    break;
                }
            }

            System.out.println(found);

            scanner.close();
        }
    }

