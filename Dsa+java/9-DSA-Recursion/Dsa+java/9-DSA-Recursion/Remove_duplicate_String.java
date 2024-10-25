// public class  Remove_duplicate_String(){
//     public static Character RDS(String str,int idx,StringBuilder newstr,boolean map){
// if(idx==str.length()){ /////BASE CASE
//    System.out.println(newstr);
//     return;
// }
// char currchar = str.charAt(idx);
// if(map[currChar-'a']==true){
//     RDS(str, idx+1, newstr, map);
// }
// else{
//     map[currChar-'a']=true;
//     RDS(str, idx+1, newstr.append(str), map);
// }
//     }
//     public static void main(String args[]){
//         String str="rraaahuuuullll";
//         RDS(str,0,new StringBuilder(""), new boolean[26]);
//     }
// }