import java.util.Scanner;
public class prime_no {
  
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int num=sc.nextInt();
    boolean isprime=true;
    if(num<=1){
      System.out.println(num+"this is not prime");
    }
    for(int i=2;i<num;i++){
      if(num%i==0){
        isprime=false;
        break;
      }
    }
    if(isprime){
      System.out.print(num+"is a prime number");
    }
    else{
      System.out.println("this is not prime number");
    }

    }
}