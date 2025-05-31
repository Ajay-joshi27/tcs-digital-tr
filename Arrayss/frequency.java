public class frequency {
/*public class FrequencyCount {
    public static void main(String[] args) {
        int[] arr = {5, 3, 5, 2, 3, 3, 1};
        int n = arr.length;
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (visited[i]) continue;

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println("Element " + arr[i] + " occurs " + count + " time(s).");
        }
    }
}
 */

 /*// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 3, 1, 5, 3, 1000};

        int[] freq = new int[1001];
        // Count frequencies
        for (int i=0;i<freq.length;i++) {
            freq[arr[i]]++;
        }
        // Print non-zero frequencies
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println("Element " + i + " appears " + freq[i] + " times");
            }
        }
    }
}

 */
}
