public class pattern10 {
    public static void main(String[] arr) {
        int n=5;
                for (int i=0; i<=n;i++){
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }

            }
            System.out.println();
        for (int i=0;i<=n;i++){
            for (int j=0;i<=n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
