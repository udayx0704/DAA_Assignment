class Solution {
    public int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int currentMax = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Decide whether to add current element to existing subarray or start new subarray
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            // Keep track of the maximum sum found so far
            maxSoFar = Math.max(maxSoFar, currentMax);
        }

        return maxSoFar;
    }
}