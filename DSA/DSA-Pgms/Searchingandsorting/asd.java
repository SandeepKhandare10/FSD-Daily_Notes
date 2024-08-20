package Searchingandsorting;

import java.util.Scanner;

public class asd {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int target= sc.nextInt();
        boolean flag= false;
        int [] arr={3,54,6,87,9,43,25};
        for (int i=0;i<arr.length;i++){
            if (arr[i]==target){
                flag=true;
                break;
            }}
            if (flag==false){
                System.out.println("not ptesrnt");}
            else {
                System.out.println("present");
            }

    }


}
