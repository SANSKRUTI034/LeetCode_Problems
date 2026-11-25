class Solution {
    public int[] runningSum(int[] nums) {

        int[] newArr = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {

            newArr[i] = nums[i];

            if(i > 0) {
                newArr[i] = newArr[i] + newArr[i - 1];
            }
        }

        return newArr;
    }
}