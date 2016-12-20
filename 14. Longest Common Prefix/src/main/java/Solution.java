/**
 * @author songpengcheng
 * @date 2016/12/20
 */

import java.util.Arrays;

/**
 * @author songpengcheng
 * @date 2016/12/20
 * @email songpengcheng@le.com
 */
public class Solution {


    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        Arrays.sort(strs);

        String min = strs[0];
        String max = strs[strs.length - 1];

        StringBuilder commonPrefix = new StringBuilder();
        for (int i = 0; i < min.length(); i++) {
            if (i < max.length() && min.charAt(i) == max.charAt(i)) {
                commonPrefix.append(min.charAt(i));
            } else {
                return commonPrefix.toString();
            }
        }

        return commonPrefix.toString();
    }
}
