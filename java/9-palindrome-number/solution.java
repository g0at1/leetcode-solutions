class Solution {
    public boolean isPalindrome(int x) {
        int sum = 0;
        int tmp = x;
        int y;
        while (x > 0) {
            y = x % 10;
            sum = (sum * 10) + y;
            x /= 10;
        }
        if (sum == tmp) {
            return true;
        }
        return false;
    }
}
