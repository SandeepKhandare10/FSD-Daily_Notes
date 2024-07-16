import java.util.Scanner;

public class boundry2DArr {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr[][]=new int[m][n] ;

        int count =0;

        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                    arr[i][j] = count++;
                System.out.print(arr[i][j]);
            }
            count=0;
            System.out.println();
        }

        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if (i==0 || j==0 || i==m-1 || j==n-1){
                    System.out.print(arr[i][j]+" ");
                }else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
