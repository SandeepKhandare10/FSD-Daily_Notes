package String;

public class ConcatStr {

    public  String canBeConcatenated(String str, String A, String B) {
        if (str.equals(A + B) || str.equals(B + A)) {
            return "Yes";
        }
        else {
            return "No";
        }
    }

    public static void main(String[] args) {
ConcatStr obj=new ConcatStr();
        System.out.println(obj.canBeConcatenated("GeeksforGeeks", "Geeksfo", "rGeeks"));
        System.out.println(obj.canBeConcatenated("Delhicapitals", "Delmi", "capitals"));
    }
}

