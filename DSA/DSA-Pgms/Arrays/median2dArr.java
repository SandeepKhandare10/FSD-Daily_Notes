package Arrays;

import java.util.Arrays;

public class median2dArr {
    public static void main(String[] args) {
        int [] [] array={{1,3,5},{2,6,9},{3,6,9}};
        int [] ans=new int[array.length*array[0].length];
        int num =0;
        for (int i =0;i< array.length;i++){
            for (int j=0;j<array[i].length;j++){
                ans[num]=array[i][j];
                num++;
            }
        }
        Arrays.sort(ans);
        if(ans.length % 2==0){
            System.out.println(ans[(ans.length+1)/2]);
        }else {
            System.out.println(ans[(ans.length)/2]);
        }
    }
}
