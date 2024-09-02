package Greedy;

public class sumofropes {
    public static void main(String[] args) {
        int [] arr={2,3,4,6};
        int sum=arr[0];
        int Tsum=0;

        for(int i=1;i<arr.length;i++){
            sum =sum+arr[i];
            Tsum = sum+Tsum;
            System.out.println(sum);
        }
        System.out.println(" "+Tsum);
    }

}
