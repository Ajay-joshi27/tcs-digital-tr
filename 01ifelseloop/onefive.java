import java.util.Scanner;

public class onefive{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>0){
            System.out.println("it is positive");
        }
        else{
            System.out.println("it is negative");
        }
        if (n%2==0) {
            System.out.println("even");
        }
        else{
            System.out.println("it is odd");
        }
        if (n%5==0 &&n%11==0) {
            System.out.println("it is divisible by 5and 11");
        }
        else{
            System.out.println("it is not divisible by 5 and 11");
        }

    
    }
}