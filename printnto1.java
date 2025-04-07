public class printnto1 {
  public static void fun(int n){
if(n==0){
  return;
}
System.out.print(n);
return fun(n-1);

  }
  public static void main(String args[]){
    System.out.print(fun(5));
  }
}
