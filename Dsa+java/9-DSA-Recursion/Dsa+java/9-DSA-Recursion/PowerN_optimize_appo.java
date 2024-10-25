public class PowerN_optimize_appo {
    public static int PowerN(int x,int n){
if(n==0){
    return 1;
}
// if Even
int halfpowersq=PowerN(x, n/2)*PowerN(x, n/2);
// if odd
if(n%2!=0){
    halfpowersq=x*halfpowersq;
}
return halfpowersq;

}
    public static void main(String args[]){
        int x=2;
int result=PowerN(x, 11);
System.out.print(result);
    }
}
// This is the optimize apporoach having time complexity ==> O(logn)