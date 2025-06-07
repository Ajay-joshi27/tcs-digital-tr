package recursion;

public class OneToN {
public static void nn(int n)
{
if(n==0) return;

 nn(n-1);
 System.out.println(n);
}

    public static void main(String[] args) {
         int n=5;
    nn(n);
}
    }
