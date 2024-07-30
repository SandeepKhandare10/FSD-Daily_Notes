import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        String FisrstStr = sc.next();
        String SecondStr = sc.next();
        char[] FisrstStr1 = FisrstStr.toCharArray();
        char[] SecondStr1 = SecondStr.toCharArray();
        Arrays.sort(FisrstStr1);
        Arrays.sort(SecondStr1);
        boolean flag = false;
        if (FisrstStr1.length == SecondStr1.length) {
            for (int i = 0; i < FisrstStr1.length; i++) {
                if (FisrstStr1[i] != SecondStr1[i]) {
                    flag = true;
                }
            }
        } else
            System.out.println("Not Anagram");
        if (flag == false) {
            System.out.println("is Anagram");
        } else
            System.out.println("Is not Anagram");

    }
}

