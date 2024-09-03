package Arrays;

import java.util.ArrayList;
import java.util.List;


public class binarttodecimal {
    public static void main(String args[]){
        int num=10;

        List<Integer> list=new ArrayList<>();
        while(num>0){
            int n=num%2;
            list.add(n);
            num=num/2;
        }


        for (int i=0;i<list.size();i++){
            System.out.print(list.get(i));
            int ans= list.get(i);
        }

        System.out.println();
        int binaryString=1111;

        int decimal=Integer.parseInt(String.valueOf(binaryString),2);

        System.out.println(decimal);
    }
}
