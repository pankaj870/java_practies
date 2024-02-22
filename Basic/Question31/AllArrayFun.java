package JavaScript.Question31;

/**
 * AllArrayFun
 */
public class AllArrayFun {

    public static int sum(int num) {
        num += num;
        return num;
    }

    public static int mul(int num) {
        num *= num;
        return num;
    }

    public static int min(int num) {
        num -= num - 9;
        return num;
    }

    public static void main(String[] args) {
        int num = 5;
        int arr[] = { sum(num), mul(num), min(num) };

        for (int el : arr) {
            System.out.println(el);
        }
    }
}