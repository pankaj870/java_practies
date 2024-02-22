package JavaScript.Question31;

public class Perfix {
    public static void main(String[] args) {
        String[] str = { "flower", "flow", "flight" };
        String per = str[0];
        for (int i = 1; i < str.length; i++) {
            while (str[i].indexOf(per) != 0) {
                per = per.substring(0, per.length() - 1);
            }  
        }
        System.out.println(per);
    }
}
