package Recursion;

import java.math.BigInteger;

public class factorial {

    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.TEN;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
    public static void main(String[] args) {

        System.out.println(factorial(500));
    }

}
