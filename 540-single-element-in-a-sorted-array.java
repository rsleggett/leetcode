class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length == 1)
        {
            return nums[0];
        }
        for (int i = 0; i < nums.length; i+=2 )
        {
            int current = nums[i];
            if(i+1 > nums.length-1)
            {
                return current;
            }
            int next = nums[i+1];
            if(current != next)
            {
                return current;
            }
        }
        return 0;
    }
}
