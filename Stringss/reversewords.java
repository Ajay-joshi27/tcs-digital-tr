package Stringss;

public class reversewords {
    public static void main(String[] args) {
        
    
String str=" i love india";

String[] str1=str.split(" ");
for (int i = str1.length-1 ;i>0; i--) {
    System.out.print(str1[i]);

    if(i!=0)
    {
        System.out.print(" ");
    }
}
    }
}
