import java.util.*;
public class sum_of_first_n {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int num=sc.nextInt();
    int empt=0;
    for(int i=0;i<=num;i++){
    empt=i+empt;
  
    }
    System.out.print(empt);
}
}
