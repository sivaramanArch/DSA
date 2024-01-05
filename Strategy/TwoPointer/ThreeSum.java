// 🥵

import java.util.Arrays;

public class ThreeSum {
    static boolean twoSum(int[] nums, int target, int ignoreIndex) {
        int si = 0;
        int ei = nums.length - 1;

        while (si < ei) {
            if (si == ignoreIndex) {
                si += 1;
                continue;
            }

            if (ei == ignoreIndex) {
                ei -= 1;
                continue;
            }

            int currentSum = nums[si] + nums[ei];

            if (currentSum == target) {
                return true;
            }

            if (currentSum < target) {
                si += 1;
            }

            if (currentSum > target) {
                ei -= 1;
            }

        }

        return false;
    }

    static boolean threeSum(int[] nums, int target) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            if (twoSum(nums, target - current, i)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 7, 1, 2, 8, 4, 5 };
        int target = 10;
        System.out.println(threeSum(arr, target));
    }

}
