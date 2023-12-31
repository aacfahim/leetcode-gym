class Solution {
    public void sortColors(int[] nums) {

        int n = nums.length;

        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                if(nums[j] < nums[i]){
                    swap(nums, i, j);
                }
            }

        }
        
    }

    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
