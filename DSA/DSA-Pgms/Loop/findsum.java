package Loop;

public class findsum {
    static int[] findtwosum(int[] arr, int key) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == key) {
                    return new int[]{arr[i], arr[j]};
                }
            }
        }
        return new int[]{-1, -1};
    }
    static int Unicnumber(int []arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;

                }
            }
        }
        int ans=-1;
        for (int i=0;i< arr.length;i++){
            if (arr[i]>0){
                ans=arr[i];
            }
        }
        return ans;
    }
    static int[]findthreesum(int []arr,int key){
        for (int i=0;i< arr.length-2;i++){
            for(int j=i+1;j< arr.length-1;j++){
                for (int k=j+1;k< arr.length;k++){
                    if (arr[i]+arr[j]+arr[k]==key){
                        return new int[]{arr[i],arr[j],arr[k]};
                    }
                }
            }
        }
        return new int[]{-1, -1,-1};
    }

    public static void main(String[] args) {
        int[] arr = new int[]{14, 85, 78, 45, 9, 8, 6, 4};
        int[] result = findthreesum(arr,18);
        if (result[0] != -1) {
            System.out.println(STR."Pair found: \{result[0]}, \{result[1]}, \{result[2]}");
        } else {
            System.out.println("No pair found");
        }
        int[]ans=findtwosum(arr,10);
        if (ans[0]!=-1){
            System.out.println(ans[0]+" "+ans[1]);
        }
        System.out.println(Unicnumber(arr));


    }
}
