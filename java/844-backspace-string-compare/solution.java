class Solution {
    public boolean backspaceCompare(String s, String t) {
        return builder(s).equals(builder(t));
    }

    private String builder(String str) {
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c != '#') {
                sb.append(c);
            } else if (sb.length() != 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
        }

        return sb.toString();
    }
}
