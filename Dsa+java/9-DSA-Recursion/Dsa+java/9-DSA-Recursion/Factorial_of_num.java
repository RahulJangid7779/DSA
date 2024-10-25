public class Factorial_of_num {
    public static int Factorial(int n){
if(n==0){
return 1;
}
int fact1=n*(n-1);
System.out.println(fact1);
return fact1;
};
public static void main(String args[]){

int n=5;
Factorial(n);
    }
}
