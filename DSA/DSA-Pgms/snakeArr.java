import java.util.Scanner;

public class snakeArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int number=0;

        int count = 0;
        int arr[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            if (i%2==0){
                for (int j = 1; j < n; j++) {
                    System.out.print(arr[i][j] = i + j);
            }

//                arr[i][j] = number++;
//                count += arr[i][j];
            }else {
                for (int j = n; j >= 0; j--) {
                    System.out.print(arr[i][j] = i + j);
            }
            System.out.println();
        }

    }
}}

