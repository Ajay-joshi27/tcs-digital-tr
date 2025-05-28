package Stringss;

public class pallindrome {
    public static void main(String[] args) {
        String s="mffom";
      // String original=s;

        int start=0;
        int end=s.length()-1;
        boolean isp=true;

        while (start<end)
         {
            if (s.charAt(start)!=s.charAt(end)) {
                    isp=false;
            }
            start++;
            end--;
                
            }
            if (isp) 
            {
                System.out.println("is palindrom");
            }

        }
    }

