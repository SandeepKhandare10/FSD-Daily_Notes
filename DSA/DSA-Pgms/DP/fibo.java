package DP;

public class fibo {
    static int[] fibo(int n) {

        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        } 

        return arr;
    }

    public static void main(String[] args) {
        int n = 13;
        int[] fiboarr= fibo(15);
        System.out.println(fiboarr[6]);
//        System.out.println(fibo(n));
    }
}
