import java.util.Scanner;

public class array_02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int number[]=new int[size];
//        for input
        for(int i=0;i<size;i++){
            number[i]=sc.nextInt();
        }
        int x=sc.nextInt();
//        for output
        for(int i=0;i<number.length;i++){
            if (number[i]==x){
                System.out.println("X is found at index "+i);
            }
            System.out.println(number[i]);
        }
    }
}
