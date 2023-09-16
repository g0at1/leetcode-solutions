class Solution {
    public boolean repeatedSubstringPattern(String str) {
        String result = str + str;

        if (result.substring(1, result.length() - 1).contains(str))
            return true;
        return false;
    }
}
