package Stringss;

public class removespecialchar {
    public static void main(String[] args) {
        String s="sad@#$$xfvddf";

        // StringBuilder sb=new StringBuilder(s);
       String ss= s.replaceAll("[^a-zA-Z0-9]", "");
    System.out.println(ss);
    }
}
