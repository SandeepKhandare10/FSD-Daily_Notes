package String;
import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class PracticeQuations {

    static int delToMkPalindrom(String str) {

        int count = 0, i = 0, j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) == str.charAt(j)) {
                i++;
                j--;
            } else {
                if ((str.charAt(i) == str.charAt(j - 1)) || (str.charAt(j) == str.charAt(i + 1)))
                    count++;
                else
                    count += 2;

                if (str.charAt(i) == str.charAt(j - 1))
                    j--;
                else if (str.charAt(j) == str.charAt(i + 1))
                    i++;
                else {
                    i++;
                    j--;
                }
            }
        }
        return count;
    }

    public static boolean isIsomorphic(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        int[] map = new int[256];

        for (int i = 0; i < 256; i++) {
            map[i] = -1;
        }

        for (int i = 0; i < str1.length(); i++) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);

            int ch1Index = ch1;
            int ch2Index = ch2;

            if (map[ch1Index] == -1) {
                map[ch1Index] = ch2Index;
            } else if (map[ch1Index] != ch2Index) {
                return false;
            }
        }

        return true;
    }

    static int distinctSubsequences(String str) {

        if (str.length() == 1)
            return 2;

        if(str.isEmpty())
            return 0;

        ArrayList<String> subString = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                StringBuilder sb = new StringBuilder();
                for (int k = i; k <= j; k++) {
                    sb.append(str.charAt(k));
                }
                subString.add(sb.toString());
            }
        }
        for (int i = 0; i < subString.size(); i++) {
            for(int j = i+1 ;j < subString.size();j++){
                if(subString.get(i).equals(subString.get(j))){
                    subString.remove(j);
                }
            }
        }
        return subString.size() + 1;
    }
    public static void main(String[] args) {



        String str = "aebcbda";
        System.out.println(isIsomorphic("xxy" ,"aab"));
        System.out.println(delToMkPalindrom(str));
        System.out.println(distinctSubsequences(str));



    }
}

//
//        public static int min(int x, int y)
//        {
//            return (x < y) ? x : y;
//        }
//
//        public static int utility_fun_for_del(String str,
//                                              int i, int j)
//        {
//            if (i >= j)
//                return 0;
//            if (str.charAt(i) == str.charAt(j))
//            {
//                return utility_fun_for_del(str,
//                        i + 1, j - 1);
//            }
//
//            return 1 + Math.min(utility_fun_for_del(str, i + 1, j),
//                    utility_fun_for_del(str, i, j - 1));
//        }
//
//        public static int min_ele_del(String str)
//        {
//
//            return utility_fun_for_del(str, 0,
//                    str.length() - 1);
//        }
//
//        // Driver Code
//        public static void main(String[] args)
//        {
//            String str = "abefbac";
//
//            System.out.println("Minimum element of deletions = " +
//                    min_ele_del(str));
//        }
//    }
