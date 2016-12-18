/**
 * Created by songpengcheng on 2016/12/18.
 */
public class Solution {

    public int MaxArea(int[] height)
    {
        int left = 0, right = height.length - 1;
        int maxArea = 0;
        while (left < right && left >= 0 && right <= height.length - 1)
        {
            maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left));
            /**
             * 这个想法的基础是，如果i的长度小于j，无论如何移动j，短板在i，不可能找到比当前记录的area更大的值了，只能通过移动i来找到新的可能的更大面积；
             * 相反，如果长度大于j，只能通过移动j起来获得更大的面积
             */
            if (height[left] > height[right])
            {
                right--;
            }
            else
            {
                left++;
            }
        }
        return maxArea;
    }
}
