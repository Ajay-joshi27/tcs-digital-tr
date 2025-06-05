public class MergeTwoSorteArrays {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,7,8,9};
        int[] arr1={5,6,7,8};
        int n=arr.length;
        int m=arr1.length;
        int sum=n+m;
        int[] mergedArray=new int[sum];

        
       for (int i = 0; i < n; i++) {
        mergedArray[i]=arr[i];
       }
        int index=0;
       for (int i =n; i <sum; i++) {
        mergedArray[i]=arr1[index];
        index++;
      }
  
    for (int i = 0; i <sum ; i++) {
        for (int j = i+1; j < sum; j++) {
            if (mergedArray[i]>mergedArray[j]) {
                int temp=mergedArray[i];
                mergedArray[i]=mergedArray[j];
                mergedArray[j]=temp;
            }
        }
    }
       for (int i : mergedArray) {
            System.out.print(i+", ");
       }
    }
}


