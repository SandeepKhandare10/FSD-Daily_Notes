public class HWpattern02 {
    public static void main(String[] args) {
        int n = 5;
//        int j=5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" ");

            if (i==j || j==(n-i-1)){
                System.out.print("*");
            } else
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
