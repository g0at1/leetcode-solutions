class Solution {
    public int maximumWealth(int[][] accounts) {
        int maximumWealth = 0;
        int totalWealth = 0;
        for (int i = 0; i < accounts.length; i++) {
            totalWealth += accounts[i];
            maximumWealth = Math.max(maximumWealth, totalWealth);
        }

        return maximumWealth;
    }
}
