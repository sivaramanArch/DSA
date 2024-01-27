public class Solution {
    public static boolean checkPossibility(int[] nums) {
        int lowestTillNow = nums[0];
        int opCount = 0;

        int lp = 0;
        int rp = 1;

        while (rp < nums.length) {
            System.out.println(nums[lp] + ":" + nums[rp]);

            if (nums[lp] <= nums[rp]) {
                lowestTillNow = nums[lp];
                lp += 1;
                rp += 1;
            }

            else {
                System.out.println("else " + opCount + ":" + lowestTillNow);
                System.out.println(nums[lp] + ":" + nums[rp] + ":" + lowestTillNow);
                if (opCount >= 1) {
                    return false;
                }

                if (lp == 0) {
                    nums[lp] = nums[rp];
                    opCount += 1;
                }

                else if (nums[lp] < lowestTillNow) {
                    System.out.println("Case 1" + nums[lp] + ":" + lowestTillNow);
                    if (opCount < 1) {
                        nums[lp] = nums[rp];
                        opCount += 1;
                    }

                    System.out.println(opCount);
                }

                else if (nums[rp] < lowestTillNow) {
                    System.out.println("Case 2" + nums[rp] + ":" + lowestTillNow);
                    if (opCount < 1) {
                        nums[rp] = nums[lp];
                        opCount += 1;
                    }
                    System.out.println(opCount);

                }

                else if(nums[lp] > nums[rp]) {
                    nums[lp] = nums[rp];
                    opCount += 1;
                }

                else if(nums[lp] < nums[rp]) {
                    nums[rp] = nums[lp];
                    opCount += 1;
                }

                lp += 1;
                rp += 1;
            }

        }

        return true;
    }

    public static void main(String[] args) {
        int[] arg = new int[]{1,5,4,6,7,10,8,9};
        var res = checkPossibility(arg);
    }
}