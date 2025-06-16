package TwoDimensionalArrays;

public class reverse {
    public static void print(int[][] arr){
         int n=arr[0].length;
        int m=arr.length;
         for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int n=arr[0].length;
        int m=arr.length;

        int[][] reverse=new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j <n; j++) {
                    reverse[i][j]=arr[j][i];
                }
            }
            // print(reverse);
        for (int i = 0; i < arr.length; i++) {
            int start=0;
            int end=n-1;
            while (start<end) {
                int temp=reverse[i][start];
                 reverse[i][start]=reverse[i][end];
                 reverse[i][end]=temp;
                 start++;
                 end--;
            }
        }
print(reverse);
       
    }
}
