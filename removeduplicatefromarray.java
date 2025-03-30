import java.util.Arrays;

public class removeduplicatefromarray {
  public static void main(String args[]){
    int[] arr={1,1,2};
    int j=1;
    for(int i=1;i<arr.length;i++){
      if(arr[i]!=arr[i-1]){
        arr[j]=arr[i];
        j++;
      }
    }
   int[] uniqueelemt=Arrays.copyOf(arr,j);
   System.out.print(Arrays.toString(uniqueelemt));
  }


}
