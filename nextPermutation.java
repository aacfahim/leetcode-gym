// https://leetcode.com/problems/next-permutation
// 31. Next Permutation
// Space: O(n); space: O(1)

class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int index = -1;

        for(int i = n-2; i >= 0; i--){
            if(nums[i] < nums[i+1]){
                index = i;
                break;
            }
        }

        if(index == -1){
            revNum(nums, 0);
        }else{
            for(int i = n -1; i >= index; i--){
                if(nums[i] > nums[index]){
                    int temp = nums[i];
                    nums[i] = nums[index];
                    nums[index] = temp;
                    revNum(nums, index+1);
                    break;
                }
            }
        }

    }

    public static void revNum(int[] nums, int start){
        int end = nums.length -1;

        while(end > start){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }

}
