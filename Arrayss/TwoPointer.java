public class TwoPointer {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int n=arr.length;

       int i=0;
       int j=n-1;

       while(i<=j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
       }
for (int k : arr) {
    System.out.print(k+" ");
}



    }
}