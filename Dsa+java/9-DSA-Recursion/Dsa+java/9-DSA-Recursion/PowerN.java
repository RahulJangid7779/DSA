public class PowerN {
    public static int powern(int x,int n){
if(n==0){
    return 1;
}
return x*powern(x,n-1);
    }
    public static void main(String args[]){
int x=2;
int result =powern(x,10);
System.out.println(result);

    }
}
