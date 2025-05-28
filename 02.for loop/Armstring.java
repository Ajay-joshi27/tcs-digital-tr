public class Armstring {
    public static void main(String[] args) {
        int n=153;
        int temp=n;
        int count=0;
        int sum=0;
        for (int i = 1; n>0; i++) {
            n=n/10;
            count++;
        }
                n=temp;
        for (int i = 1; i <=count; i++) {
                int digit=n%10;
             double power=Math.pow(digit, count);
               sum+=power;
               n=n/10;
        }
       if (temp==sum) {
        System.out.println(sum+":: is armstrong nubmer");
       }
       else
       {
        System.out.println("it is not armstring number");
       }


    }
}
