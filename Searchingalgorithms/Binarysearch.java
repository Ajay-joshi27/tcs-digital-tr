package Searchingalgorithms;

import java.util.Arrays;

public class Binarysearch {
public static void main(String[] args) {
    int[] arr={2,3,4,5,6,7,8,8,65,4,3,32,2};
    Arrays.sort(arr);
    int n=arr.length;
    int target=32;
    int i=0;
    int j=n-1;
    while (i<=j) {
        int mid=(i+j)/2;
        if(arr[mid]==target)
        {
            System.out.println(mid);
            break;
        }
        else if(arr[mid]>target)
        {
            j=mid-1;
        }
        else if(arr[mid]<target){
            i=mid+1;
        }
        else{
            System.out.println("element not found");
        }
    }

}
}
