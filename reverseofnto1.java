public class reverseofnto1 {
  public static void fun(int n){
    if(n==0){
      return;
    }  
    fun(n-1);
    System.out.print(n+" ");
}
      public static void main(String args[]){
        System.out.print(fun(5));
      }
}

