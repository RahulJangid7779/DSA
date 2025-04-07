public class BinarySearchUsingRecursion {
public static int binarusearch(int arr[],int start,int end,int target){
if(start>end){
  return  -1;
}
int mid=start+(end-start)/2;
if(arr[mid]==target){
  return mid;
}
if(target<arr[mid]){
 return binarusearch(arr,target,start,mid-1);
}
else{return binarusearch(arr,target,mid+1,end);}
  }
  public static void main(String args[]){
    int[] arr={1,2,3,4,5,6};
    int end=arr.length;
   int target=2;
    System.out.print(binarusearch(arr,0,end,target));
   
  }
}