public class triangle{
  public static void triangle(int row,int column){
    if(row==0){
      return;

    }
    if(row<column){
      System.out.print("*");
      triangle(row, column+1);

    }
    else{
System.out.println();
triangle(row-1, column);

    }
public static void main(String args[]){
  triangle(4,0);
}
    }
  }
