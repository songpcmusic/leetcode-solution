/**
 * @author songpengcheng
 * @date 2016/12/26
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author songpengcheng
 * @date 2016/12/26
 * @email songpengcheng@le.com
 */
public class Solution {

    public static int threeSumClosest(int[] nums, int target) {
        if (nums == null || nums.length < 3) {
            return 0;
        }
        int result = 0;
        int diff = -1;

        // 排序
        Arrays.sort(nums);

        // 只执行到倒数第三位
        for (int i = 0; i < nums.length - 2; i++) {
            if (i - 1 >= 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int temp = target - nums[i];
            int low = i + 1, high = nums.length - 1;

            while (low < high) {
                if (nums[low] + nums[high] == temp) {
                    return nums[i] + nums[low] + nums[high];

                } else if (nums[low] + nums[high] < temp) {
                    if (target - (nums[i] + nums[low] + nums[high]) < diff || diff == -1) {
                        diff = target - (nums[i] + nums[low] + nums[high]);
                        result = nums[i] + nums[low] + nums[high];
                    }
                    low++;
                } else {
                    if ((nums[i] + nums[low] + nums[high]) - target < diff || diff == -1) {
                        diff = (nums[i] + nums[low] + nums[high]) - target;
                        result = nums[i] + nums[low] + nums[high];
                    }
                    high--;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {0, 2, 1, -3};
        int target = 1;

        threeSumClosest(nums, target);
    }
}
