import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        for (int i=1;i<=10;i++){

                System.out.println(num+" x "+i+" = "+num*i);
        }
//        String[] Str = new String[3];
//        int[] integers = new int[3];
//        for (int i = 0; i < 3; i++) {
//            Str[i] = sc.next();
//            integers[i] = sc.nextInt();
//
//        }
//        for (int i = 0; i < 3; i++) {
//            System.out.printf("%-15s%03d%n", Str[i], integers[i]);
//        }
    }
}