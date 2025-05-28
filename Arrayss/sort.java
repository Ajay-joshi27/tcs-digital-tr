public class sort {
public static void main(String[] args) {
    int[] arr={2,1,3,5,6,4,7,3,22,55,6644,22222,44,8};
    int n=arr.length;

    for (int j = 1; j < arr.length; j++) {
        for (int i = 0; i <n-1; i++) {
        if (arr[i]>arr[i+1]) {
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
    }
    }
    for (int ele:arr) {
        System.out.print(ele+" ");
    }
}

}
