public class arraybasic{

  public static void main(String[] args) {
int[] arr={2,1,34,55,11};
int min=arr[0];
int max=arr[0];
for(int i=1;i<arr.length-1;i++){
  if(min<arr[i]){
    min=arr[i];
  }

  if(max>arr[i]){

    max=arr[i];
  }

}
System.out.print("this is a max vale "+max+"and"+min+"this is a min value");

  }
}
