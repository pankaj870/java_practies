package JavaScript.Question31;

import java.util.ArrayList;

public class subArraySum {

    public static void Find(int[] nums, int i, int len) {
        ArrayList <Integer> list = new ArrayList<>();
        if (len == 0) {
            return;
        }
        for (int k = i; k < nums.length; k++) {
            for (int j = i; j <= k; j++) {
            int sum += nums[i];
            }
            System.out.println();
        }
        Find(nums, i + 1, len - 1);
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        Find(nums, 0, nums.length);
    }
}
