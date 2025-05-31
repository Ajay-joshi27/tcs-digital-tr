// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class pallindrome {
     public static void main(String[] args){
       
           int n=121;
           int dup=n;
           int rev=0;
           for(int i=0;n>0;i++)
           {
               int digit=n%10;
                rev=rev*10+digit;
               n=n/10;
           }
          if(rev==dup)
          {
              System.out.print("it is pallindrome");
          }
          else
          {
              System.out.print("it is not pallindrome");
          }
       
    }
}