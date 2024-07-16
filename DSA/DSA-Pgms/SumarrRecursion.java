public class SumarrRecursion {

   public static int sumArrya(int[] array ,int index) {
            if (index == array.length) {
                return 0;
            } else {
                System.out.println(array[index]);
                return array[index] + sumArrya(array,index + 1);
            }
        }
        public static void main (String[]args){
            int[] arr= {5, 55, 66, 98, 9, 86, 5, 6, 8};

                int arrsum=sumArrya(arr,0);
                System.out.println(arrsum);


        }
    }

