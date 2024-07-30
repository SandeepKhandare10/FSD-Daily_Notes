public class Fibonachi {
    int a=0;
    int b=1;
      void fib (int x){
        if(x==10)
        return ;

        int num =a+b;

          System.out.println(num);
          a=b;
          b=num;
          fib(x+1);
    }
    public static void main(String[] args) {
//        int a = 0;
//        int b = 1;
//        System.out.print(a + " ");
//        System.out.print(b + " ");
//        for (int i = 2; i <= 10; i++) {
//            int num = a + b;
//            System.out.print(num + " ");
//            a = b;
//            b = num;
        Fibonachi cd=new Fibonachi();
        System.out.println(0);
        System.out.println(1);
        cd.fib(1);
        }
    }

