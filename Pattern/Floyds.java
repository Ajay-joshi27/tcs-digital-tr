package Pattern;
public class Floyds {
    public static void main(String[] args) {
       int number=1;
        for (int i = 0; i <=5; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print((number++) +" ");
            }
            System.out.println();
        }
    }
}

