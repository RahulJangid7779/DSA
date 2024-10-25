public class firstocc{
    public static int  firstoccurance(int key,int arr[],int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstoccurance(key, arr, i+1);
    }
    public static void main(String args[]){
int key =10;
int arr[]={1,2,4,5,10,2,331,3};
int result = firstoccurance(key,arr,0);
System.out.print(result);
    }
}