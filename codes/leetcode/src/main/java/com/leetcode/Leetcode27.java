package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <a href="https://leetcode.cn/problems/remove-element/description/?envType=study-plan-v2&envId=top-interview-150">移除元素</a>
 * 27. 移除元素
 * 已解答
 * 简单
 * 相关标签
 * 相关企业
 * 提示
 * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素。元素的顺序可能发生改变。然后返回 nums 中与 val 不同的元素的数量。
 *
 * 假设 nums 中不等于 val 的元素数量为 k，要通过此题，您需要执行以下操作：
 *
 * 更改 nums 数组，使 nums 的前 k 个元素包含不等于 val 的元素。nums 的其余元素和 nums 的大小并不重要。
 * 返回 k
 */
public class Leetcode27 {
    public int removeElement(int[] nums, int val) {
        int k =0;
//        int j=nums.length - 1;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == val){//待移除的元素，可以考虑从后往前找一个来替换。
                for (int j =i+1;j<nums.length;j++){
                    if(nums[j]!= val){
                        k++;
                        nums[i]=nums[j];
                        nums[j]=val;
                        break;
                    }
                }
            }else{
                k++;
            }
        }
        return k;
    }
}
