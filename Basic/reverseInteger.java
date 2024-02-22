package Basic;

/**
 * reverseInteger
 */

// 1. Write a program to reverse an integer in Java.

public class reverseInteger {

    public static void Fun(int num, int reverse) {

        if (num == 0) {
            System.out.println(reverse);
            return;
        }
        int t2 = num % 10;
        int temp = num / 10;
        reverse = reverse * 10 + t2;
        Fun(temp, reverse);
    }

    public static void main(String[] args) {
        Fun(17872, 0);
        // int num = 123323;
        // int reverse = 0;
        // while (num % 10 != 0) {
        // int remander =num%10;
        // reverse = reverse*10+remander;
        // num /= 10;
        // }
        // System.out.println(reverse);
    }
}