package TwoDimensionalArrays;

public class one {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6}};
        int[][] arr2={{7,8,9},{10,11,12}};
        int[][] result=new int[2][3];

        int m=arr.length;
        int n=arr2[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <n; j++) {
                result[i][j]=arr[i][j]+arr2[i][j];
            }
        }
         for (int i = 0; i < m; i++) {
            for (int j = 0; j <n; j++) {
                System.out.print(result[i][j]+" ");
                 
            }
            System.out.println();
        }
    }
}
