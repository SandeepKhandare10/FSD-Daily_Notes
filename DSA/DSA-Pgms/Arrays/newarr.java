package Arrays;

import java.util.Arrays;

public class newarr {
    public static void main(String[] args) {
        int max = 0;
        int[] arr = new int[5];
        arr[0] = 1;

        arr[1] = 10;
        arr[2] = 14;
        arr[3] = 8;
        arr[4] = 7;
        Arrays.hashCode(arr);


        for(int i=0;i<5;i++){
//         System.out.print(arr[i]+" ");
            if (arr[i]>max)
                max=arr[i];
            }
        System.out.println(max);
    }
}
