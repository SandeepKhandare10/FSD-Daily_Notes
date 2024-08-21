package Recursion;

public class bitwiseOperatr {
    public static void main(String[] args) {
        int a=45;
        System.out.println(5&3);
        System.out.println(4^6);
        System.out.println(4|4);
        System.out.println(~5);

        System.out.println(8&1);
        System.out.println(5&1);
        if ((a&1)==0){
            System.out.println("even");
        }else
            System.out.println("odd");
    }
}
