class Solution {
    public int maxSubArray(int[] nums) {
        int rmax = 0;
        int gmax = nums[0];
        for (int i = 0; i < nums.length; i++) {
            rmax = Math.max(nums[i], rmax + nums[i]);
            gmax = Math.max(rmax, gmax);
        }
        return gmax;
    }
}