package Arrays;

public class arrlargestEle {
    public static void main(String[] args) {
        int [] arr={1,4,3,2,87,8};
        int temp=0;
        int sum=0;
        for (int i=0;i< arr.length;i++){
            sum+=arr[i];
            for (int j=i+1;j< arr.length;j++){
                if (arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }

        }
        System.out.println(sum);
        System.out.println(temp);
    }
}
