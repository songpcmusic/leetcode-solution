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

        for (int i = 0; i < nums.length; i++) {
            if (i - 1 >= 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int target = 0 - nums[i];
            int j = i + 1, k = nums.length - 1;

            while (j < k) {
                if (nums[j] + nums[k] == target) {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;

                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                } else if (nums[j] + nums[k] < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }

        return result;
    }
}
