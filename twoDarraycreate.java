// package ;
import java.util.*;
public class twoDarraycreate{
  public static boolean search(int matrix[][],int key,int n,int m){
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
          if(matrix[i][j]==key){
      System.out.println("found at"+i+","+j);
      return true;
    }
      }

    }
    return false;
  }
  public static void main(String args[]){ 
     Scanner sc= new Scanner(System.in);
    int[][] matrix=new int[3][3];
  int key=3;
    int n=matrix.length;
    int m=matrix[0].length;
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        matrix[i][j]=sc.nextInt();
      }
    }
    // search
    search(matrix, key,n,m);
    // print
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        System.out.print(matrix[i][j]+" ");
      }System.out.println();
    }
  }
}