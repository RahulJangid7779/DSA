public class Fibonacci {
    public static int Fibo(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            return Fibo(n-1)+Fibo(n-2);
        }
            }
    public static void main (String args[]){
        int n=5;
        System.out.println("Fibonacci Series up to " + n + " terms:");
        for(int i=0;i<n;i++){
            System.out.println(Fibo(i));
        }
    }
}
