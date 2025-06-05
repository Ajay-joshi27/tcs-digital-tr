public class sortingdemo {
public static void main(String[] args) {
    int[] arr={10,20,7770,550,880,990,660,110,150,30,40,50,60};
    for (int i = 0; i < args.length; i++) {
        for (int j = i+1; j < args.length; j++) {
            if (arr[i]<arr[j]) {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
    for (int data : arr) {
        System.out.println(data);
    }
}
}
