/**
 * Created by songpengcheng on 2016/12/11.
 */
public class Solution {

    /*
    Reverse digits of an integer.

    Example1: x = 123, return 321
    Example2: x = -123, return -321
     */
    public static int reverse(int x) {
        if(x == 0) {
            return x;
        }

        int copy = x;
        // 如果x小于0
        if (x < 0) {
            copy = 0 - copy;
        }

        int result = 0;

        while (copy > 0) {
            if (result == 0) {
                result = result + (copy % 10);
            } else {
                // overflow
                if ((Integer.MAX_VALUE - (copy % 10)) / result < 10) {
                    return 0;
                }

                result = result * 10 + (copy % 10);
            }


            copy = copy / 10;
        }

        if (x < 0) {
            result = 0 - result;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }
}
