class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        std::sort(strs.begin(), strs.end());
        std::string result = "";
        std::string str1 = strs[0];
        std::string str2 = strs[strs.size() - 1];

        for (int i = 0; i < str1.size(); i++) {
            if (str1[i] == str2[i]) {
                result += str1[i];
            }
            else {
                break;
            }
        }
        return result;
    }
};
