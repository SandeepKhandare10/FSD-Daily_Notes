package Greedy;

public class sumofropes {
    public static void main(String[] args) {
        int [] arr={2,3,4,6};
        int sum=0;
        int Tsum=0;

        for(int i=0;i<arr.length;i++){
            sum =sum+arr[i];
            Tsum= sum+Tsum;
            System.out.println(sum);
        }
        Tsum=Tsum-arr[0];
        System.out.println(Tsum);
    }

}
