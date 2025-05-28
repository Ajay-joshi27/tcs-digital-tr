package Stringss;

import java.util.Arrays;

public class anagram {
     public static void main(String[] args) {
      String a="aja";
      String b="aaj";
      
      char[] ch=a.toCharArray();
      for(int i=0;i<ch.length;i++)
      {
          for(int j=i+1;j<ch.length;j++){
              if(ch[i]>ch[j]){
          char temp=ch[i];
          ch[i]=ch[j];
          ch[j]=temp;
              }
      }
    //   System.out.print(ch);
      }
    //   System.out.println(new String(ch));
    //   System.out.println(ch);
       char[] cha=b.toCharArray();
      for(int i=0;i<cha.length;i++)
      {
          for(int j=i+1;j<cha.length;j++){
              if(cha[i]>cha[j]){
          char temp=cha[i];
          cha[i]=cha[j];
          cha[j]=temp;
              }
      }
      }
       if(Arrays.equals(ch,cha))
       {
           System.out.print("it is anagram");
       }
       
       
    }
    
}
