/*
题目：#1两数之和
给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那两个整数，并返回它们的数组下标。
你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
你可以按任意顺序返回答案。
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum = 0;
        int N = nums.length;
        int[] ret = new int[2];
        for(int i = 0 ; i < N ; i++){
            int t = 0;
            for(int j = 0 ;j < N ; j++){
                if(i == j)continue;
                sum = nums[i] + nums[j];
                if(sum == target){
                    ret[0] = i;
                    ret[1] = j;
                    t = 1;
                    break;
                }
            }
            if(t == 1)break;
        }
        return ret;
    }
}