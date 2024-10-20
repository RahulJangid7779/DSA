public class lastocc {
    public static int  lastoccurance(int key ,int arr[],int i){
if(i==arr.length){
    return -1;
}
int isfound= lastoccurance(key, arr, i+1);
if(isfound==-1 && arr[i]==key){
    return i;
}
return isfound;

    }
    public static void main(String args[]){
int key =10;
int arr[]={1,2,10,4,5,6,10,121};
int result = lastoccurance(key,arr,0);
System.out.print(result);
    }
}
