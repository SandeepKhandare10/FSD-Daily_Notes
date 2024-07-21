package Arrays;
import java.util.Arrays;
public class source {
    public static void main(String[] args) {
        int sum = 0;
        int [][] flats=new int[3][3];
        flats[0][0]=1;
        flats[0][1]=2;
        flats[0][2]=3;
        flats[1][0]=4;
        flats[1][1]=5;
        flats[1][2]=6;
        flats[2][0]=7;
        flats[2][1]=8;
        flats[2][2]=9;

        for (int i=0;i<flats.length;i++) {
            for (int j = 0; j < flats[i].length; j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
                sum+=flats[i][j];

            }

            System.out.println("");
        }
        System.out.println(sum);
//        for (int[] fjk:flats){
//            System.out.println(fjk);
//        }

//
//        long[] a ={24,43,54,24,65,67};
//        for (int i=0;i<a.length;i++){
//            for (int j=1;j<a.length;j++){
//                if (a[i]==a[j]){
//                    System.out.println(a[j]);
//                }
//            }
//        }
//        System.out.println("///////////////////////");
//        for (long sandeep :a){
//        System.out.println(sandeep);
//    }
    }

}
