//https://leetcode.com/problems/maximum-subarray

//Time O(n) space O(n);

class Solution {
    public int maxSubArray(int[] nums) {

        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        if (n == 1) {
           maxSum = nums[0];
        } else {
            for(int i = 0; i < n; i++){
                currentSum += nums[i];
                if(currentSum > maxSum){
                    maxSum = currentSum;
                }

                if(currentSum < 0){
                    currentSum = 0;
                }
            }
        }

        return maxSum;
    }

}
