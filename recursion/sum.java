package recursion;

public class sum {
public static int summ(int n){
    if(n==1) return 1;
    return n+summ(n-1);
}
public static void main(String[] args) {
    int n=5;
    int s=summ(n);
    System.out.println(s);
}
}
