public class SumofNnum {
    public static int Summ(int n){
        if(n==0){
        return 0;
        }
        int sum=n+Summ(n-1);
        System.out.println(sum);
        return sum;
        
    }
    public static void main(String args[]){
        int n=10;
        Summ(n);
    }
     
}
