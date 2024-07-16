public class StringBuilderEx {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder();
        sb.append("SP");
        sb.append(" ");
        sb.append("How are you");
        sb.insert(1,"ANDEE");
//        sb.replace(16,20,"u");
        System.out.println(sb.length());
        sb.delete(16,20); //Delete Charecters
        sb.reverse();//reverse a String
        System.out.println(sb.toString());
    }
}
