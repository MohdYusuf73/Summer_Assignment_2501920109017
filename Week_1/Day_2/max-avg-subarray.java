class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0; 
        int gmax = Integer.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        gmax = sum;

        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            gmax = Math.max(gmax, sum);
        }
        return gmax / (double) k;
    }
}