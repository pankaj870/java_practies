package Basic;

/**
 * Armstrong
 */
public class Armstrong {
    public static void fun(int num,int temp) {
        if(num ==0){
            System.out.println(temp);
            return;
        }
         int digit = num%10;
        for(int i=1;i<=2;i++){
          digit*=digit;
                }
                num=num/10;
                fun(num, temp=temp+digit);
    }

    public static void main(String[] args) {
        fun(135,0);
    }
}