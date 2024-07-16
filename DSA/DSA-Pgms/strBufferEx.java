public class strBufferEx {
    public static void main(String[] args) {
        StringBuffer sb= new StringBuffer();
        sb.append("SP");
        sb.append(" How are you");
        sb.insert(1,"ANDEE");
//        sb.replace(16,20,"u");
        System.out.println(sb.length());
        //sb.delete(16,20); //Delete Charecters
       // sb.reverse();//reverse a String
        System.out.println(sb.toString());
    }
}
