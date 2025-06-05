public class Sortedorno {
public static void main(String[] args) {
    int[] arr={1,3,5,4,2};
    for (int index = 0; index < arr.length-1; index++) {
            if (arr[index]>arr[index+1]) {
                System.out.println("array is not sorted");
            }
    }
}
}
