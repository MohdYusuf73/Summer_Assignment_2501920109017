class Solution {
    public int[] sortedSquares(int[] nums) {
        int last = nums.length-1;
        int i = 0;
        int j = nums.length-1;
        int[] arr = new int[nums.length];
        int muli;
        int mulj;
        while(i<=j)
        {
            muli = nums[i]*nums[i];
            mulj = nums[j]*nums[j]; 
            
            if(muli>mulj)
            {
                arr[last] = muli;
                last--;
                i++;
            }
            else
            {
                arr[last] = mulj;
                last--;
                j--;
            }

        }
        return arr;
    }
}