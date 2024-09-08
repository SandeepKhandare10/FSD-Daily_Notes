import java.util.Scanner;

public class if_else02 {

    public static void main (String[]arr){
        Scanner sc = new Scanner(System.in);
        int x =sc.nextInt();
        if(x % 2 == 0){
            System.out.println("Even");
        } else {
            System.out.println("odd");
        }

    }
}
