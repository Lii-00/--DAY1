/*
题目：#26
给你一个升序排列的数组 nums ，请你原地删除重复出现的元素，使每个元素只出现一次 ，返回删除后数组的新长度。元素的相对顺序应该保持 一致 。
由于在某些语言中不能改变数组的长度，所以必须将结果放在数组nums的第一部分。更规范地说，如果在删除重复项之后有 k 个元素，那么 nums 的前 k 个元素应该保存最终结果。
将最终结果插入 nums 的前 k 个位置后返回 k 。
不要使用额外的空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array

*/


class Solution {
    public int removeDuplicates(int[] nums) {
        /* 方法一：初次做，思考得过于复杂，考虑的情况不够周全，对模型建立的不够，代码又臭又长，但引用两个指针   （count、flag）的思想是正确的 */
        /* 
        int count = 1;
        int flag = 0;
        for(int i = 1 ;i < nums.length ; i++){
            if(nums[i] == nums[flag]){
                if(i+1 == nums.length)break;
                if(nums[i+1] == nums[flag])continue;
                nums[flag+1] = nums[i+1];
                if(nums[flag] != nums[flag+1]){
                    flag++; 
                    count++;
                }   
            }
            else{
                count++;
                flag++;
            }
        }
        return count;
        */

        /* 方法二：借鉴官方其它同学，同样引用双指针（flag、scan），两个指针一个用来扫描数组，另一个用来记录数组数据 */

        int flag = 1,scan = 1;
        if(nums.length == 0 )return 0;
        for(; scan < nums.length ; scan++){
            if(nums[scan] != nums[scan-1]){
                nums[flag] = nums[scan];
                flag++;
            }
        }
        return flag;
    }
}