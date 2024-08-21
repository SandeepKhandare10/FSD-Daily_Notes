package Searchingandsorting;

public class insort {
    static void Insertionsort(int [] arr){
        int n = arr.length;
        for (int i=0;i<n;i++){
            int key =arr[i];
            int j=i-1;
            while (j>0 && arr[j] < arr[j - 1]){
                arr[j+1]=arr[j];
                j=j-1;

            }
            arr[j+1]=key;
        }
    }
        static void printarr(int[] arr){
            for (int val : arr) {
                System.out.print(val + " ");
            }
        }
    public static void main(String[] args) {
        int[] arr = {5, 7, 9, 1, 2, 3, 4};
        Insertionsort(arr);
        printarr(arr);
    }
}
