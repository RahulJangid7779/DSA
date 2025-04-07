package recursion;

public class fibonachiseries {
  public static int fibo(int n){
    if(n==1 || n==0){
      return 1;
    }
    return fibo(n-1)+fibo(n-2);
  }
  public static void main(String args[]){
System.out.print(fibo(5));
  }
}
