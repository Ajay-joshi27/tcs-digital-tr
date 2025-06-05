// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class revbyk {
    public static void reverse(int arr[], int i, int j) {
        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void byk(int[] arr, int k) {
        int n = arr.length;
        if (k == 0 || n <= 1)
            return;
        k = k % n;
        reverse(arr, 0, n - k - 1);
        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - 1);
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };

        byk(arr, 3);
        for (int data : arr) {
            System.out.print(data + " ");
        }
    }
}