package DSA_Roadmap;

class Solution {
    public static boolean checkPossibility(int[] nums) {
        int lowestTillNow = nums[0];
        int opCount = 0;

        int lp = 0;
        int rp = 1;

        while (rp < nums.length) {

            if (nums[lp] <= nums[rp]) {
                lowestTillNow = nums[lp];
                lp += 1;
                rp += 1;
            }

            else {
                if (opCount >= 1) {
                    return false;
                }

                if (lp == 0) {
                    nums[lp] = nums[rp];
                    opCount += 1;
                }

                else if (nums[lp] < lowestTillNow) {
                    if (opCount < 1) {
                        nums[lp] = nums[rp];
                        opCount += 1;
                    }

                    System.out.println(opCount);
                }

                else if (nums[rp] < lowestTillNow) {
                    if (opCount < 1) {
                        nums[rp] = nums[lp];
                        opCount += 1;
                    }
                    System.out.println(opCount);

                }

                else if (nums[lp] > nums[rp]) {
                    nums[lp] = nums[rp];
                    opCount += 1;
                }

                else if (nums[lp] < nums[rp]) {
                    nums[rp] = nums[lp];
                    opCount += 1;
                }

                lp += 1;
                rp += 1;
            }

        }

        return true;
    }
}

public class NonDecreasingArray {
    public static void main(String[] args) {
        var res = Solution.checkPossibility(new int[] { 1, 2, 0, 4, 5, 6 }) ? "non decreasing" : "not non decreasing";
        System.out.println("Provided array is :" + res);
    }
}
