class diagonal_sum { }
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int x =  mat.length-1;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat.length;j++)
            {
                if(i==j)
                {
                    sum = sum + mat[i][j];
                    if(j==x)
                    {
                        x--;
                    }
                }
                else if(i!=j && j==x)
                {
                    sum = sum + mat[i][j];
                    x--;
                }
            }
        }
        return sum;
    }
}