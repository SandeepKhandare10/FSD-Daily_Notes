package Arrays;
import java.util.Arrays;
public class source {
    public static void main(String[] args) {
        int [][] flats=new int[2][3];
        flats[0][0]=101;
        flats[0][1]=102;
        flats[0][2]=103;
        flats[1][0]=104;
        flats[1][1]=105;
        flats[1][2]=106;
        for (int i=0;i<flats.length;i++) {
            for (int j = 0; j < flats[i].length; j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
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
