class Solution {
    public int[] shuffle(final int[] nums, int n) {
        final int[] res = new int[nums.length];
        int j = 0;
        for (int i = 0; i < n; i++)
        {
            res[i*2] = nums[i];
            res[i*2+1] = nums[i+n];
        }
        return res;
    }
}
