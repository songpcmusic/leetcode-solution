/**
 * Created by songpengcheng on 2016/12/11.
 */
public class Solution {

    /*
    Reverse digits of an integer.

    Example1: x = 123, return 321
    Example2: x = -123, return -321
     */
    public int reverse(int x) {
        if(x == 0) {
            return x;
        }

        String source = String.valueOf(x);
        String result = "";

        int end = 0;
        if(source.charAt(0) == '-') {
            result = result + "-";
            end = 1;
        }

        for(int i = source.length() - 1; i >= end; i--) {
            result = result + source.charAt(i);
        }

        /**
         * 需要考虑int越界的问题
         */
        try {
            return Integer.valueOf(result);
        } catch (Exception e) {
            return 0;
        }

    }
}
