public class Practise {
     public static void main(String[] args) {
      int[] arr={1,1,1,2,3,33,44,55,6};
      int n=arr.length;
      boolean[] visited=new boolean[n];
      int maxelement=arr[0];
      int maxcount=999;
for (int i = 0; i<n; i++) {
    if (visited[i]) {
        continue;
    }
    int count=1;
    for (int j =i+1; j <n; j++) {
        if (arr[i]==arr[j]) {
            visited[j]=true;
            count++;
        }
            
        }
        System.out.println(arr[i]+" and the count is"+count);
       if (count<maxcount)
        {
        maxcount=count;
        maxelement=arr[i];
       }

    }
    System.out.println(maxelement+" "+maxcount);
}
      
}

