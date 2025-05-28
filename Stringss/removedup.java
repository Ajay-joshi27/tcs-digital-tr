package Stringss;

public class removedup {
    public static void main(String[] args) {
        String name="aajayaaj";
        StringBuilder sb=new StringBuilder();
        name.chars().distinct().forEach(c ->sb.append((char)c));
        System.out.println(sb);

        //--------------------------

        StringBuilder sb1 =new StringBuilder();
        for (int i = 0; i < name.length(); i++) {
            char ch=name.charAt(i);
            int idx=name.indexOf(ch,i+1);
            if (idx==-1) {
                sb1.append(ch);
            }
        }
        System.out.println(sb1);
    }
}
