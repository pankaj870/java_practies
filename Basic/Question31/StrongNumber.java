package JavaScript.Question31;

/**
 * StrongNumber
 */
public class StrongNumber {

    public static void main(String[] args) {

        int num = 145, output = 0;

        while (num > 0) {
            int fact = 1;
            int temp = num % 10;
            for (int i = 1; i <= temp; i++) {
                fact *= i;
            }
            output += fact;
            num /= 10;
        }
        System.out.println(output);
    }
}