public class Printnumreverse {
 // Print Number in Reverse order 10 to 1
    public static int PrintNum(int n){//3//7
        if(n==1){//4//8
            System.out.println(n);
            return n;
        }
        System.out.println(n);//5//9
        return PrintNum(n-1);//6//10
      
       
    
    }
    
        public static void main(String args[]){
            int n=10;     //1
            PrintNum(n);  //2
            
        }
    }


