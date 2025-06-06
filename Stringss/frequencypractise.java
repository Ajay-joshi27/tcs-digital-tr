package Stringss;

public class frequencypractise {
    public static void main(String[] args) {
        String str="aaaaaajajajjay";
        char[] ch=new char[str.length()];
        for(int i=0;i<str.length();i++)
        {
            ch[i]=str.charAt(i);
        }
        // for(char data:ch)
        // {
        //     System.out.print(data+" ");
        // }
        boolean[] visited=new boolean[ch.length];
         for(int i=0;i<ch.length;i++)
         {
             if(visited[i]) continue ;
             int count=1;
             
             for(int j=i+1;j<ch.length;j++)
             {  visited[j]=false;
                 if(ch[i]==ch[j])
                 {
                     visited[j]=true;
                     count++;
                 }
             }
             System.out.println(ch[i]+"="+count);
         }
    }
}