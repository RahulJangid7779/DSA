public class maxsumsubarray {
  public static void main(String[] args) {
    int max=Integer.MIN_VALUE;
    int[] arr={1,2,3,4};
    
    int n=arr.length;
    for(int start=0;start<n;start++){int sum=0;
      for(int end=start;end<n;end++){
        sum+=arr[end];
        max=Math.max(max,sum);
      }
    }
    System.out.print("max subarray sum:"+max);
  }
}
