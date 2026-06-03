class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int k=0,m;
        while(i<j)
        {
            m=k;
            k= Math.min(height[i],height[j])*(j-i);
            k= Math.max(m,k);
            if(height[i]<height[j])
            {
                i++;
            }
            else{
                j--;
            }
        }
               return k;    
}
}