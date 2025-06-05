public class Sort0s1s2s {
    public static void main(String[] args) {
        int[] arr = { 0, 0, 0, 0, 1, 1, 2, 1, 2,1};
        int n = arr.length;
        int zero = 0;
        int one = 0;
        int two=0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                zero++;} 
                else if(arr[i]==1) {
                one++;}
                // else {
                //     two++;
                // }
        }
        int sum=zero+one;
        for (int i = 0; i <n; i++) {
            if (i<zero) {
                arr[i]=0;
            }
            else if(i<sum){
                arr[i]=1;
            }
            else {
                arr[i]=2;
            }
        }
       
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
