class Fact {
    public static void main(String[] args) {
        int N=5;
        int fact=1;
        for(int i=N;i>0;i--)
        {
            fact*=i;
        }
        System.out.println(fact);
    }
}