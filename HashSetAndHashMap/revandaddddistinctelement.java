package HashSetAndHashMap;

import java.util.HashSet;

public class revandaddddistinctelement {
    public static int reverse(int n)
    {
int digit=0;
int reversee=0;
while (n>0) {
    digit=n%10;
    reversee=reversee*10+digit;
    n=n/10;
}
return reversee;
    }
    public static void main(String[] args) {
        
    
int[] arr={10,20,45,54,65,75};

HashSet<Integer>  set=new HashSet<>();
for (int i = 0; i < arr.length; i++) {
    set.add(arr[i]);
        set.add(reverse(arr[i]));
}
System.out.println(set.size());

    }
}
