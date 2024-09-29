package String;

public class revstr {
    public static void main(String[] args) {
        String str="pune is huge city";

        String[] ch =str.split(" ");

        for(int i = ch.length - 1; i >= 0; i--){
            System.out.print( ch[i]+" ");
        }
    }
}
