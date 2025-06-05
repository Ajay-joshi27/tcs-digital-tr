public class Sort0s1s {
    public static void main(String[] args) {
        int[] arr={0,0,0,0,1,1,0,1,0,1,0,1,0,1,0};
        int n=arr.length;
            int zero=0;
            int one=0;
            for (int i = 0; i <n; i++) {
                if (arr[i]==0) {
                    zero++;
                }
                else{
                    one++;
                } 
            }
            System.out.print(zero+" "+one);
            for (int j =0; j <one; j++) {
                    arr[j]=1;
                }
                for (int i =one; i <n; i++) {
                    arr[i]=0;
                }
                System.out.println();
            for (int i : arr) {
                System.out.print(i+" ");
            }
    }

}
