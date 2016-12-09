/**
 * @author songpengcheng
 * @date 2016/12/9
 */

/**
 * @author songpengcheng
 * @date 2016/12/9
 * @email songpengcheng@le.com
 */
public class Solution {

    /*
    The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

    P   A   H   N
    A P L S I I G
    Y   I   R

    And then read line by line: "PAHNAPLSIIGYIR"
    Write the code that will take a string and make this conversion given a number of rows:

    string convert(string text, int nRows);
    convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
     */
    public static String convert(String s, int numRows) {
        if (s == null || s.length() == 0 || numRows <= 1) {
            return s;
        }

        String[] result = new String[numRows];
        for (int i = 0; i < result.length; i++) {
            result[i] = "";
        }


        int row = 0;
        boolean sequence = true;
        for (int i = 0; i < s.length(); i++) {

            result[row] = result[row] + s.charAt(i);

            if (sequence) {
                row = row + 1;
            } else {
                row = row - 1;
            }

            if (row == numRows - 1) {
                sequence = false;
            }

            if (row == 0) {
                sequence = true;
            }
        }

        String resultStr = "";
        for (String str : result) {
            if (str == null) {
                continue;
            }

            resultStr = resultStr + str;
        }

        return resultStr;
    }

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        System.out.println(convert(s, 3));
    }
}
