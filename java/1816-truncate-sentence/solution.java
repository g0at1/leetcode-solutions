class Solution {
    public String truncateSentence(String s, int k) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == ' ') {
                k--;
                if (k == 0) {
                    return sb.toString();
                }
            }

            sb.append(ch);
        }

        return sb.toString();
    }
}
