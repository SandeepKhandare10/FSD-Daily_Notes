public class PowerRecurtion {

       static int Power(int n, int p) {
            if (p == 0) {
                return 1;
            } else {
                return n* Power(n,p-1);
            }
        }
        public static void main (String[]args){
            PowerRecurtion asd =new PowerRecurtion();

            System.out.println(asd.Power(4,2));


        }
    }



