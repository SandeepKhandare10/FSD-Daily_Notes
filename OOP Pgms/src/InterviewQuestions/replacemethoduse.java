package InterviewQuestions;

public class replacemethoduse {
    public static void main(String[] args) {
        String str="asdd ありがとうございます 1235556541010";
        str=str.replaceAll("[^a-zA-Z0-9]","");
        str.trim();
        System.out.println(str);
    }

}
