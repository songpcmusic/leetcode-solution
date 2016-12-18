/**
 * Created by songpengcheng on 2016/12/18.
 */
public class Solution {
    public static boolean isPalindrome1(int x) {
        // positive
        if (x < 0) return false;
        // 1 digit
        if (x >= 0 && x < 10) return true;
        // end with 0
        if (x > 0 && x % 10 == 0) return false;

        int reverse = 0;
        while (x > reverse) {
            reverse = reverse * 10 + x % 10;
            x = x / 10;
        }
        return x == reverse || x == reverse / 10;
    }

    /**
     * 复制了top solutions里的一个代码
     * 太神奇了
     * 用了return中的表达式来判断是否overflow
     *
     * 此解法在leetcode中会报超时现在
     * @param x
     * @return
     */
    public static boolean isPalindrome(int x) {

        if (x < 0) return false;

        int copy = x;
        int reverse = 0;

        while (copy >= 10) {
            reverse = reverse * 10 + copy % 10;
            copy = copy / 10;
        }

        return reverse == x / 10 && copy == x % 10;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(123456));
    }
}
