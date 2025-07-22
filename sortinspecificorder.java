import java.util.*;
public class sortinspecificorder {

public static void main(String args[]){
int arr[]={1, 2, 3, 5, 4, 7, 10};
Arrays.sort(arr);
int count=0;
int n=arr.length-1;
for(int i=n;i>0;i--){
if(arr[i]%2!=0){
  arr[count]=arr[i];
  count++;
}
}
System.out.println(Arrays.toString(arr));
}  
}
