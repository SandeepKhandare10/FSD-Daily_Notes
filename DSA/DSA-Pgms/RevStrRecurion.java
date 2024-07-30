import java.util.Scanner;

public class RevStrRecurion {
    int i = 0;

    String Reverse(String str) {
        char[] charArray = str.toCharArray();
        return reverseHelper(charArray);
    }
    String reverseHelper(char[] charArray) {
        if (i >charArray.length/ 2) {
            return new String(charArray);
        } else {
            char temp = charArray[charArray.length- 1 - i];
            charArray[charArray.length - 1 - i] = charArray[i];
            charArray[i] = temp;
            i++;
            return reverseHelper(charArray);
        }
    }
    public static void main(String[] args) {
        RevStrRecurion obj = new RevStrRecurion();
        System.out.println(obj.Reverse("UpGrad"));
    }
    /*
    public class RevStrRecurion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        String namerevers = "";

        for(int i = (name.length() - 1); i >= 0 ; i--){
            namerevers +=name.charAt(i);
        }
        System.out.println(namerevers);
    }
     */

}
