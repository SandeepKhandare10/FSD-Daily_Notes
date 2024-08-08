package Recursion;

public class leapyear {
    public static void main(String[] args) {
        int year=1900;
        boolean flag=true;
        if (year%4==0) {
            if (year%100==0){
                if (year%400==0){
                    flag=true;
                }else {
                    flag=false;
                }
            }else {
                flag=true;
            }

        } else {
            flag=false;
        }
        if (flag){
            System.out.println("leapyear");
        }else
            System.out.println("not leapyear");

    }


}
