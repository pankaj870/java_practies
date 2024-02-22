package JavaScript.Question31;
public class CheckFile {
    public static void main(String[] args) {
        String str[] = {"flower", "flow", "flight"};
       
        String p = str[0];
        for(int i=1;i<str.length;i++){
            String curr =str[i]; //flow 
            int j=0;
            // 0<5 && 0<4 && f == f  // 1<5 && 1<4 && l == l // ... //3<5 && 3<4 over && w=w condition false
            // ** idx =1 ; // 0<4 && 0<5 && f=f // 1<4 && 1<5 && l = l // 2<4 && 2<5 && o == i condition false   
            while (j < p.length() && j<curr.length() && p.charAt(j) == curr.charAt(j)) {
                j++;
                // idx =0 par j=3;
                // idx=1 par j=2
            }
//0,4 flow // 0,2 fl
            p=p.substring(0, j);
        }

        System.out.println(p);
    }
}