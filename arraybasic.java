package Array;
import java.util.*;

public class arraybasic {
  public static void main(String args[]){
int[] arr={6,7,9,5};
for(int i=1;i<arr.length;i++){
int current=arr[i];
int previous=current-1;
while(previous>=0 && arr[previous]>current){
 arr[previous+1]=arr[previous];
 previous--;
}
arr[previous+1]=arr[current];
}
System.out.println(Arrays.toString(arr));}
  }

