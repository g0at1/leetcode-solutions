class Solution {
    public String longestCommonPrefix(String[] strs) {
        int index = 0;
        Arrays.sort(strs);
        String str1 = strs[0];
        String str2 = strs[strs.length - 1];

        while (index < str1.length() && index < str2.length()) {
            if (str1.charAt(index) == str2.charAt(index)) {
                index++;
            }
            else {
                break;
            }
        }
        return str1.substring(0, index);
    }
}
