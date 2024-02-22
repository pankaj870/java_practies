package JavaScript.Question31;

import java.util.Scanner;

/**
 * FibonachiR
 */
public class FibonachiR {
    public static void find_Fibonachi(int a , int b ,int input) {
        if(input == 0){
            return;
        }
        int c=a+b;
        System.out.println(c);
        find_Fibonachi(b, c, input-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=0,b=1;
int input = sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        find_Fibonachi(a, b, input);
    }
}