class Solution {
    public int subtractProductAndSum(int n) {
        String digits = Integer.toString(n);
        int sum = digits.charAt(0) - '0';
        int product = digits.charAt(0) - '0';
        for (int i = 1; i < digits.length(); i++)
        {
            sum += digits.charAt(i) - '0';
            product *= digits.charAt(i) - '0';
        }
        return product - sum;
    }
}
