public class countingsort
{
  public static void countingsort(int[]arr){
    int largest=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
      largest=Math.max(largest,arr[i]);
    }
    int count[]=new int[largest+1];
    for(int i=0;i<arr.length;i++){
      count[arr[i]++];
    }
    //sort
    int j=0;
    for(int j=0;j<count.length;i++){
      while (count[i]>0) {
        a
      }
    }
  }
  public static void main(String[] args) {
    int[] arr={1,4,1,3,2,4,3,7};
    countingsort(arr);
  }
}