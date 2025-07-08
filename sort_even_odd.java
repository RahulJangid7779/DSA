import java.util.*;
public class sort_even_odd {
  public static void arr1(int arr[],n,left,rigth){
    while(left<rigth){
      if(arr[left]%2==0 && arr[right]%2==1){
        left++;
        rigth--;
      }
      if(arr[left]%2==0){
        left++;
      }
      if(arr[right]%2==1){
        right--;
      }
    }
    System.out.print(arr);
  }
  public static void main(String args){
    int n= arr.length-1;
    int left=0;
    int right=n-1;
    int arr[]={1,2,3,4,5,6,7,8};
    arr1(arr,n,left,rigth);
  }
}
