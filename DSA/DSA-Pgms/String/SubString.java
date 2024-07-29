package String;

public class SubString {

    public static void main(String[] args) {
        String str ="abc";
        int len=str.length();
        int n=len+(len+1)/2;
        int k=0;
        for (int i=0;i<str.length();i++){
            for (int j=i;j<str.length();j++){

                System.out.println(str.substring(i,i+j));
            }
        }
    }
}
