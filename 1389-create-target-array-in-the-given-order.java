class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        var target = new int[index.length];
        for (int i = 0; i < index.length; i++)
        {
            int newItem = nums[i];
            int newIndex = index[i];
            int prev = target[newIndex];
            target[newIndex] = newItem;
            for(int j = newIndex+1;j<index.length;j++)
            {
                int temp = target[j];
                target[j] = prev;
                prev = temp;
            }   
        }
        return target;
    }
}
