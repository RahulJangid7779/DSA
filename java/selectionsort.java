package Array;
// pick and put at begineening
public class selectionsort {
  public static void selectionsort(int[]arr){
for(int i=0;i<arr.length-1;i++){
  int minpos=i;
  for(int j=i+1;j<arr.length;j++){
    if(arr[i]>arr[j]){
      minpos=j;
    }
  }
  int temp=arr[minpos];
  arr[minpos]=arr[i];
  arr[i]=temp;

}
  }
  public static void main(String [] args) {
    int[] arr={5,3,4,2,1};
    selectionsort(arr);
    for(int num:arr){
      System.err.println(num);
    }
  }
}
