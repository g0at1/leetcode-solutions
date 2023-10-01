class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            StringBuilder reversed = new StringBuilder(word);
            reversed.reverse();
            sb.append(reversed).append(" ");
        }

        return sb.toString().trim();
    }
}
