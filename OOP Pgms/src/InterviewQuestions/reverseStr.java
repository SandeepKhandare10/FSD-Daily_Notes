package InterviewQuestions;

public class reverseStr {
    public static void main(String[] args) {
        String str="assdf";
        StringBuffer as = new StringBuffer(str);


        int n=str.length();
        String rev = "";
        for(int i=str.length()-1;i>=0;i--){
            rev= rev + str.charAt(i);
            System.out.println(rev); 
        }

        System.out.println(as.reverse());
    }
}
