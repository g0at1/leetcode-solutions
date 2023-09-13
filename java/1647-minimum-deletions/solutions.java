class Solution {
    public int minDeletions(String s) {
        int alphabetCount = 26;
        int deletionCount = 0;
        int[] freq = new int[alphabetCount];
        
        for (char ch : s.toCharArray()) 
            freq[ch - 'a']++;

        Set<Integer> set = new HashSet<>();
    
        for (int i = 0; i < alphabetCount; i++) {
            while (freq[i] != 0 && !set.add(freq[i])) {
                --freq[i];
                deletionCount++;
            }
        }

        return deletionCount;
    }
}
