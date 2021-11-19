class Solution {
    public int hammingDistance(int x, int y) {
        if (x == y)
        {
            return 0;
        }
        int dist = 0;
        for (int val = x ^ y; val > 0; ++dist)
        {
            val = val & (val - 1);
        }
        return dist;
    }
}
