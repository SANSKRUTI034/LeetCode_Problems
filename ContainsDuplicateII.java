//This problem is solved using Brute Force. But this problem can also be solved using HashMap
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        for (int left = 0; left < nums.length; left++) {

            for (int right = left + 1; right < nums.length; right++) {

                if (nums[left] == nums[right]) {

                    if (right - left <= k) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
