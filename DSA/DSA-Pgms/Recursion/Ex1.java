package Recursion;

public class Ex1 {
    int n = 5;
    int i = 1;
    String nm = "ASDF";

    String printname(String nm, int n) {
        if (i > n) {
            return null;
        }
        System.out.println(nm);
        i++;
        return printname(nm, n);
    }
    public static void main(String[] args) {
        Ex1 ex = new Ex1();
        ex.printname(ex.nm, ex.n);  // Call the method with the default values
    }
}

