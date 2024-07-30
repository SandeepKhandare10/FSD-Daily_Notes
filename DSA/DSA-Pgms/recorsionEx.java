public class recorsionEx {
    static double fact(double x){
        if (x==1)
            return 1;
//        System.out.print(x+" ");

       return x*fact(x-1);
//        System.out.print(x+" ");
    }
    public static void main(String[] args) {
//        recorsionEx sd =new recorsionEx();
        double num=fact(500);
        System.out.println(num);

    }
}
