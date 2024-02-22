package Recursion;

public class FirstAndLastaccurance {
   public static void Find(String str,int idx) {
    if(str.charAt(idx)==(str.charAt(0))){
        System.out.println(str.charAt(idx) +" "+ idx);
        return;
    }else{
        Find(str, idx-1);
    }
   }
    public static void main(String[] args) {
      
        String str="askdncnamc";
          int idx = str.length();
Find("askdncncamc", idx);
// done :
// for(int i=str.length()-1;i>0;i--){
//     if(str.charAt(i)==str.charAt(0)){
// System.out.print(str.charAt(i)); 
// System.out.print(" " + i);
//     break done;
// }
// }
    }
}
