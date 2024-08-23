package Loop;

public class secondlagestele {
    static int findmax(int [] arr){
        int max =Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        } 
        return max;
    }
    static int findsecondmax(int [] arr){
        int max=findmax(arr);
        for (int i =0;i<arr.length;i++){
            if(arr[i]==max){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int secondmax=findmax(arr);

        return secondmax;
    }
    public static void main(String[] args) {

    int[] arr={1,2,5,9,25,26,88,55,6,4,88,45};

        System.out.println(findmax(arr));
        System.out.println(findsecondmax(arr));


}
}
