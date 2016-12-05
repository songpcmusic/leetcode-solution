/**
 * @author songpengcheng
 * @date 2016/12/5
 */

/**
 * @author songpengcheng
 * @date 2016/12/5
 * @email songpengcheng@le.com
 */
public class Solution {

    /*
    Given a string, find the length of the longest substring without repeating characters.

    Examples:

    Given "abcabcbb", the answer is "abc", which the length is 3.

    Given "bbbbb", the answer is "b", with the length of 1.

    Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
     */
    public static int lengthOfLongestSubstring(String s) {
        if (s.equals("")) {
            return 0;
        }
        int maxLen = 1, currentLen = 1, len = s.length(), i, repeat;
        for (i = 1; i < len; i++) {
            System.out.print(s.substring(i - currentLen, i) + ", " + s.substring(i, i + 1));
            repeat = s.substring(i - currentLen, i).indexOf(s.substring(i, i + 1));
            System.out.print(", " + repeat);
            if (repeat == -1) {
                currentLen++;
            } else {
                currentLen -= repeat;
            }
            if (maxLen < currentLen) {
                maxLen = currentLen;
            }

            System.out.println(", " + currentLen + ", " + maxLen);
        }
        return maxLen;
    }


    public static void main(String[] args) {
        String test = "fdopsjfsodjfsodaugsdngioengfdsjopjgfdoisgdspofigfdpougfopfdsiug";
        System.out.println(lengthOfLongestSubstring(test));
    }
}
