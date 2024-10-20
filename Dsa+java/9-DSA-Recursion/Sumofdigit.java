public class Sumofdigit {
    public static int sunofdigit(int n){
if(n==0){
    return 0;
}
return (n%10)+sunofdigit(n/10);
    }
    public static void main(String args[]){
int n=2134;
int result =sunofdigit(n);
System.out.println(result);
    }
}
