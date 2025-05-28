public class secondmax {
    public static void main(String[] args) {
        int[] arr={1,3,33,444,555,5,666,777,8888};
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max=arr[i];
            }
        }
        System.out.println(max);
         for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
