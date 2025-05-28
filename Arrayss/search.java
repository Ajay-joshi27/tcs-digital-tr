public class search{
 public static void main(String[] args) 
 {
    int x=7;
    int[] a={2,3,4,7,6,7};
    int n=a.length;
    boolean b=false;
    for (int i = 0; i < n; i++) 
    {
        if (a[i]==x)
         {
          b=true;
            break;
        }
    }
    if (b==true) {
        System.out.println("found ");
    }
 }

}