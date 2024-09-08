import java.util.Scanner;

public class loop_01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
//        for(int i=0;i<=10;i=i+1) {
//            //  System.out.println("Hello world");
//            System.out.println(i);
//            int i = 0;
//            while (i < 11) {
//                System.out.println(i);
//                i++;
//            }
//        }
//        int i=0;
//        do {
//            System.out.println(i);
//            i++;
//        }while (i<11);
//        int i =11;
//        while (i<10){
//            System.out.println("sandeep");
//            i++;
//        }

             for(int i=2; i<=10; i++) {
             System.out.println(n*i);
             }



    }
}
