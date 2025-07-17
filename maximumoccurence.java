public class maximumoccurence {
public static void main(String args[]){
  String str="greeek";
  int freq[]= new int[256];
  for(int i=0;i<str.length();i++){
    freq[str.charAt(i)]++;
  }
int max=-1;
char result = ' ';
for(int i=0;i<str.length();i++){
if(freq[str.charAt(i)]>max){
  max=freq[str.charAt(i)];
  result=str.charAt(i);
}

}
System.out.print(result);
} 
}
