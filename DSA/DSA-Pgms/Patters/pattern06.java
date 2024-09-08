import java.util.*;
public class pattern06 {
    public static void main(String[] args) {

        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int a = scan.nextInt();
//        int b = scan.nextInt();
//        int c = scan.nextInt();
//        // Complete this line
//        // Complete this line
//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        // Complete this line
//        // Complete this line
//    }
//}