public class max {
    public static void main(String[] args) {
        int[] a={1,22,33,444,55,66,77};
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) 
        {
            if (a[i]>max) 
            {
                max=a[i];
            }
        }
        System.out.println(max);
    }
}
