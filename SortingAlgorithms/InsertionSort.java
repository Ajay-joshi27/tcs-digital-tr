package SortingAlgorithms;

public class InsertionSort {
public static void main(String[] args) {
    int[] arr={5,4,3,2,1};
    int n=arr.length;
    for (int i = 1; i < n; i++) {
        for (int j = i; j>=1; j--) {
            if(arr[j]<arr[j-1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
        }
    }
     for (int i : arr) {
            System.out.print(i+" ");
        }
}
}
