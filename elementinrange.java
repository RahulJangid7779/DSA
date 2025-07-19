import java.util.*;
public class elementinrange {
  public static void main(String[] args) {
    int arr[]={1,4,5,2,7,8,3};
    Arrays.sort(arr);
    for(int i=0;i<arr.length;i++){
      if(arr[i]>=2 && arr[i]<=5){

        System.out.print(arr[i]);
      }
    }
  }
}
