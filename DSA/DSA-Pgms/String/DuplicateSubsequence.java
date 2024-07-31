package String;

public class DuplicateSubsequence {
    public static String[] findSubSequence(String str) {
        if (str.isEmpty()) {
            return new String[]{""};
        }
        String smallAns[] = findSubSequence(str.substring(1));

        String ans[] = new String[2 * smallAns.length];
        int k = 0;
        for (int i = 0; i < smallAns.length; i++) {
            ans[k] = smallAns[i];
            k++;
        }

        for (int i = 0; i < smallAns.length; i++) {
            ans[k] = str.charAt(0) + smallAns[i];
            k++;
        }
        return ans;
    }
    public static boolean hasDuplicateSubsequence(String[] str) {


       for (int i =0;i<str.length;i++){
           for (int j =0;j<str.length;j++){
               if (str[i].equals(str[j])){
                   return true;

               }
           }
       }
        return false;
    }

    public static void main(String[] args) {

        String[] str1 = findSubSequence("geeksforgeeks");
        System.out.println(hasDuplicateSubsequence(str1));
    }
}

