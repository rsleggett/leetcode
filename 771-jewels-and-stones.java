class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> jewelsHash = new HashSet<>();
        for(int i = 0; i < jewels.length(); i++)
        {
            jewelsHash.add(jewels.charAt(i));
        }
        int count = 0;
        for(int i = 0; i < stones.length(); i++)
        {
            count += jewelsHash.contains(stones.charAt(i)) ? 1:0;
        }
        return count;
    }
}

// bool[] alphabet = new bool[256];
// alphabet[A] = 1;
