/**
 * @author songpengcheng
 * @date 2016/12/22
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author songpengcheng
 * @date 2016/12/22
 * @email songpengcheng@le.com
 */
public class Solution {

    public static List<String> letterCombinations(String digits) {
        String[] keyMap = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        List<String> result = new LinkedList<String>();
        if(digits == null || digits.isEmpty()) {
            return result;
        }

        result.add("");

        for (int i = 0; i < digits.length(); i++) {
            int keyIndex = digits.charAt(i) - '0';
            String keyStr = keyMap[keyIndex];

            int size = result.size();
            for (int resultIndex = 0; resultIndex < size; resultIndex++) {
                String current = result.get(0);
                result.remove(0);

                for (int j = 0; j < keyStr.length(); j ++) {
                    result.add(current + keyStr.charAt(j));
                }
            }

        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }
}
