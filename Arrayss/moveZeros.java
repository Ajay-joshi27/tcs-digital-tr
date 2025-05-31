
import java.util.Arrays;

public class moveZeros {
    public static void main(String[] args) {
        int[] a={1,0,2,0,40,5,0,5,6};
        int n=a.length;
        Arrays.sort(a);

        int[] b=new int[n];

        for (int i =0; i < n-1; i++)
         {
            for (int k=0 ; k < b.length-1; k++) 
            {
            if (a[i]>a[k]) 
            {
                int temp=a[i];
                a[i]=b[k];
                b[k]=temp;
            }
            }
        }
        for (int i : b) {
            System.out.print(i+" ");
        }
    }
}
