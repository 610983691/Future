package com.leetcode;

/**
 * <a href="https://leetcode.cn/problems/merge-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150">合并两个有序数组</a>
 * 88. 合并两个有序数组
 * 已解答
 * 简单
 * 相关标签
 * 相关企业
 * 提示
 * 给你两个按 非递减顺序 排列的整数数组 nums1 和 nums2，另有两个整数 m 和 n ，分别表示 nums1 和 nums2 中的元素数目。
 * <p>
 * 请你 合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列。
 * <p>
 * 注意：最终，合并后数组不应由函数返回，而是存储在数组 nums1 中。为了应对这种情况，nums1 的初始长度为 m + n，其中前 m 个元素表示应合并的元素，后 n 个元素为 0 ，应忽略。nums2 的长度为 n 。
 *
 * @author tongjie
 */
public class LeetCode88 {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    /**
     * 使用双指针，每次找到一个较小的值放到队列头。为了保证队列头的空间足够，先把队列往后移动n个位置
     *
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index_num1 = n;
        int index_num2 = 0;
        System.arraycopy(nums1, 0, nums1, n, m);
        for (int i = 0; i < m + n; i++) {
            if(index_num1>=m+n && index_num2>=n){
                return;
            }else if(index_num1>=m+n){
                nums1[i] = nums2[index_num2];
                index_num2++;
            }else if(index_num2>=n){
                nums1[i] = nums1[index_num1];
                index_num1++;
            }else {
                if (nums1[index_num1] > nums2[index_num2]) {
                    nums1[i] = nums2[index_num2];
                    index_num2++;
                } else {
                    nums1[i] = nums1[index_num1];
                    index_num1++;
                }
            }
        }
    }
}