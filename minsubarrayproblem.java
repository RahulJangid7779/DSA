package Array;

public class minsubarrayproblem {
  public static void main(String[] args) {
    int[] arr = {3, -4, 2, -3, -1, 7, -5};
    int minendhere=arr[0];
    int minsofar=arr[0];
    for(int i=1;i<arr.length;i++){
      minendhere=Math.min(arr[i],minendhere+arr[i]);
      minsofar=Math.min(minsofar,minendhere);
    }
    System.out.println("minimum sum subarray",minsofar);
  }
}
