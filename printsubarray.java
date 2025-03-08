package Array;

public class printsubarray{
public static void main(String[] args) {
  int[] arr={1,2,3,4,5,6};
  for(int i=0;i<=arr.length-1;i++){
    int start=i;
    for(int j=i;j<arr.length;j++){
      int end=j;
      for(int k=start;k<=end;k++){
        System.out.print(arr[k]+" ");
      }
      System.out.println();
    }
    System.out.println();
  }
}
}