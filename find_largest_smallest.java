import java.util.Arrays;

public class find_largest_smallest {
  public static void main(String args){
    int[] arr={1,3,4,5,6,7,12,111};
    for(int i=0;i<arr.length;i++){
      for(int j=i+1;j<arr.length;j++){
        if(arr[j]>arr[j+1]){
          int temp=arr[j+1];
          arr[j+1]=arr[j];
          arr[j]=temp;
        }
      }
    } System.out.print(arr[i]+""+arr[arr.length]);
    
   
  }


}
