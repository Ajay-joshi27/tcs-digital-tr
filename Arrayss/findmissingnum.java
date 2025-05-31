public class findmissingnum {

    public static int msnumber(int[] arr,int n)
    {
        int formula=n*(n+1)/2;
            int actualsum=0;
        for (int i : arr) 
        {
          actualsum+=i;
        }
        
        return formula-actualsum;
    }
public static void main(String[] args) {
int[] arr={1,2,3,4,5,7};
int n=7;

System.out.println(msnumber(arr, n));
}
}
