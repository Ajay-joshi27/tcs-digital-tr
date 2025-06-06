package Stringss;

public class pallindromespecialcase {
public static void main(String[] args) {
    String s= "A man, a plan, a canal: Panama";
    String cleaned="";
        
   for (int i = 0; i < s.length(); i++) {
    char ch=s.charAt(i);
     if ((ch >= 'a' && ch <= 'z') ||(ch >= 'A' && ch <= 'Z')|| (ch >= '0' && ch <= '9')) {
        cleaned+=s.charAt(i);
     }
   }
   System.out.println("1");
   int start=0;
       int end=cleaned.length()-1;
       boolean b=false;
       while(start<end)
       {
           if(cleaned.charAt(start)==cleaned.charAt(end))
           {
               b=true;
               start++;
               end--;
           }
          
       }
       System.out.print("2");
       if(b){
           System.out.print("it is Pallindrome");
       }
       else{
        System.out.println("IT IS NOT PALLINDROME");
       }
   
   
}
}
