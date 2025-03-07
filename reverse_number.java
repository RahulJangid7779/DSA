public class reverse_number {
  
  public static void main(String args[]){
    int num=12345;
while(num>0){
  int last=num%10;
  System.out.println(last);
  num=num/10;
}
}
}