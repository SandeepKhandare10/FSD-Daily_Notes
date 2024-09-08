public class hwpattern {
    public static void main(String[] args) {
        int n=5;
//        for (int i=n;i>=1;i--){
//                for (int j=n;j<=n-i;j--){
//                        System.out.print("1 ");
//                }
//            for (int j=1;j<=n-i;j++){
//                System.out.print(" 0");
//            }
//                System.out.println();
//            }
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }

            for (int k = n; k > i ; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
