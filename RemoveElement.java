class Solution {
    public int removeElement(int[] nums, int val) 
    {
   
        int i=0;
        int j=0;
        for(i=0 ; i<=nums.length-1 ; i++)
        {
            if(nums[i] !=val)
            {
                nums[j] = nums[i];
                j++;
            }
            else
            {
                
            }
        }
        return j;

    }
}