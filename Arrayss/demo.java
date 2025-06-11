
public class demo {
    public static void main(String[] args) {
        int j=0;
            int[] arr={0,0,1,2,3,40,0,4,0,0,3};
            int n=arr.length;
            int[] dup=new int[n];
       for (int i = 0; i < arr.length; i++) {
           if (arr[i]==0) {
            continue;
           }
           else{
                dup[j]=arr[i];
                j++;  
            }    
           }
           for (int i : dup) {
            if (i!=0) {
                System.out.print(i+" ");
            }
            
           }
       }
    }