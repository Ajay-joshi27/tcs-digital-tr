public class frequencyofnum {
    public static void main(String[] args) {
        int[] arr = {1, 3,1,5, 2, 1, 4, 1, 2};
        int max = 1000; // Assuming values are between 0 and 1000

        int[] freq = new int[max + 1];

        for (int num : arr) {
            freq[num]++;
        }

        System.out.println("Frequencies:");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println(i + " → " + freq[i]);
            }
        }
    }


}
