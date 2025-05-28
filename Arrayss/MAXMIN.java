 public class MAXMIN {
public static void main(String[] args) {
    int[] arr={1,2,3,4,64,43,4,5,64433,55};
    int max=Integer.MAX_VALUE;
    int min=Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {

        if(arr[i]>min)
        {
            min=arr[i] ;                                                                                                                          
        }
    }
         for (int i = 0; i < arr.length; i++) {

        if(arr[i]<max)
        {
            max=arr[i] ;                                                                                                                          
        }
    }
    System.out.println("the min element in the array is :: "+max);
    System.out.println("the max element in the array is :: "+min);
}
}
