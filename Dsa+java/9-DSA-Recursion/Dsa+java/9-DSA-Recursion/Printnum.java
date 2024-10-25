// Print Number 1 to 10
public class Printnum{
public static int PrintNum(int n){//3//7
    if(n==10){//4//8
        System.out.println(n);
        return n;
    }
    System.out.println(n);//5//9
    return PrintNum(n+1);//6//10
  
   

}

    public static void main(String args[]){
        int n=1;     //1
        PrintNum(n);  //2
        
    }
}
