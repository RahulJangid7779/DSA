import java.lang.reflect.Array;
import java.util.Arrays;

public class arraybasic{
  public static void main(String[] args) {
int[] arr={2,1,34,55,11};
int left=0;
int right=arr.length-1;
while (left<right) {
  int temp = arr[left];
  arr[left] = arr[right];
  arr[right] = temp;
  }
}System.out.print(Arrays.toString(temp));

}
