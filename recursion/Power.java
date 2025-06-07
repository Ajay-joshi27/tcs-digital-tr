package recursion;

public class Power {
    public static int pow(int n,int p)
    {
        if(n==1) return 1;
        int result=(int)Math.pow(n, p);
        return  result;
}
public static void main(String[] args) {
    int n=5;
    int p=3;
    int result=(int)Math.pow(n, p);
    System.out.println(result);
    System.out.println(pow(4, p));
}
}
