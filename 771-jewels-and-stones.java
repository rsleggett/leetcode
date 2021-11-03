class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        boolean[] ascii = new boolean[256];
        for(int i = 0; i < jewels.length(); i++) //O(n)
        {
            ascii[jewels.charAt(i)] = true; //O(1)
        }
        int count = 0;
        for(int i = 0; i < stones.length(); i++) //O(m)
        {
            count += ascii[stones.charAt(i)] ? 1:0; // O(1)
        }
        return count;
    }
}

// bool[] alphabet = new bool[256];
// alphabet[A] = 1;
// O(m) + O(n)
