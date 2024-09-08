//public class xpattern {
//    public static void main(String[] args) {
//
////        *
////        * *
////        * * *
////        * * * *
////        * * * * *
//        int n = 5;
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=n;j++){
//                if (i==j|| j+i==n+1){
//                    System.out.print("*" );
//                }
//                else {
//                    System.out.print(" ");
//                }
//
//            }
////        for (int i = 1; i <= n; i++) {
////            for (int j = 1; j <= i; j++) {
////                System.out.print("* ");
////            }
////            System.out.println();
////        }
//
////        0 0 0 0
////        0 0 0 1
////        0 0 1 1
////        0 1 1 1
////        1 1 1 1
////    for (int i=1;i<=n;i++){
////        for (int j=1;j<=n-i;j++){
////            System.out.print(" 0");
////        }
////        for (int k=2;k<=i;k++){
////            System.out.print(" 1");
////        }
////        System.out.println();
////    }
////            for (int i=1;i<=n;i++){
////                for (int j=n;j>=i;j--){
////                    System.out.print("*");
////                    }
////        for (int j=1;j<=i;j++){
////            System.out.println("*");
////        }
//            System.out.println();
//    }
////        System.out.println();
//    }
//
//}
class xpattern {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=5;j>=i;j--){
                if(j==n||j==i || i==1){
                    System.out.print("*");
                }
                else{
                    System.out.print("0");
                }


            }
            System.out.println();
        }

    }
}