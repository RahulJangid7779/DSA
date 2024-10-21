public class Tiling_Problem {
    public static int TileProb(int n){
         if(n==0 || n==1){
            return 1;
         }
         int verical=TileProb(n-1);
         int horizonta=TileProb(n-2); 
         return verical+horizonta;

    }
    public static void main(String args[]){
System.out.print(TileProb(3));
    }
}
