/**
 * @author songpengcheng
 * @date 2016/12/20
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author songpengcheng
 * @date 2016/12/20
 * @email songpengcheng@le.com
 */
public class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (nums == null || nums.length < 3) {
            return result;
        }

        // 排序
        Arrays.sort(nums);

        // 只执行到倒数第三位
        for (int i = 0; i < nums.length - 2; i++) {
            if (i - 1 >= 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int target = 0 - nums[i];
            int low = i + 1, high = nums.length - 1;

            while (low < high) {
                if (nums[low] + nums[high] == target) {
                    result.add(Arrays.asList(nums[i], nums[low], nums[high]));

                    // 先执行去重 不然会超市
                    while (low < high && nums[high] == nums[high - 1]) {
                        high--;
                    }
                    while (low < high && nums[low] == nums[low + 1]) {
                        low++;
                    }

                    low++;
                    high--;
                } else if (nums[low] + nums[high] < target) {
                    low++;
                } else {
                    high--;
                }
            }
        }

        return result;
    }
}
