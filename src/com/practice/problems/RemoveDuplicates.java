package com.practice.problems;

import java.util.Arrays;

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0)
        {
            return 0;
        }
        int  i = 0;
        for (int j = 0; j < nums.length; j ++)
        {
            if (nums[j] != nums[i])
            {
                i += 1;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
public class RemoveDuplicates
{
    public static void main(String[] args)
    {
        int [] nums = {0,0,1,1,1,2,2,3,3,4};
        Solution obj = new Solution();
        int result = obj.removeDuplicates(nums);
        System.out.println(result);
    }
}