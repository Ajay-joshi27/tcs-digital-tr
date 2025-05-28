class StrongNumber {
    public static void main(String[] args) {
  int  number=145;
  int totalsum=0;
  for(int i=1;number>0;i++)
  {
      int digit=number%10;
       number=number/10;
      int sum=1;
      for(int j=digit;j>0;j--)
      {
          sum*=j;
      }
      totalsum+=sum;
  }
            if(totalsum==number)
            {
        System.out.println(totalsum+"it is a strong number");
            }
            else
            {
                System.out.println("it is not a string number");
            }
    }
}