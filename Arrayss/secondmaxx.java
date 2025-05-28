import java.util.Arrays;

public class secondmaxx {
public static void main(String[] args) {
    int[] arr={1,2,3,4,5};
    int n=arr.length;
    Arrays.sort(arr);
int max=arr[n-1];
int secondmaxx=Integer.MIN_VALUE;
    for (int i =n-2; i>=0 ; i--) 
    {
        if (arr[i]<max) 
        {
            secondmaxx=arr[i];
            break;
        }
    }
        if (secondmaxx==-1) 
        {
            System.out.println("second max not found");
        }
        else
        {
            System.out.println("second max="+secondmaxx);
        }
}
}
