/*ou are given a n x n 2D array grid containing distinct elements in the range [0, n2 - 1].

Implement the neighborSum class:

neighborSum(int [][]grid) initializes the object.
int adjacentSum(int value) returns the sum of elements which are adjacent neighbors of value, that is either to the top, left, right, or bottom of value in grid.
int diagonalSum(int value) returns the sum of elements which are diagonal neighbors of value, that is either to the top-left, top-right, bottom-left, or bottom-right of value in grid.


 

Example 1:

Input:

["neighborSum", "adjacentSum", "adjacentSum", "diagonalSum", "diagonalSum"]

[[[[0, 1, 2], [3, 4, 5], [6, 7, 8]]], [1], [4], [4], [8]]

Output: [null, 6, 16, 16, 4]

Explanation:



The adjacent neighbors of 1 are 0, 2, and 4.
The adjacent neighbors of 4 are 1, 3, 5, and 7.
The diagonal neighbors of 4 are 0, 2, 6, and 8.
The diagonal neighbor of 8 is 4.
Example 2:

Input:

["neighborSum", "adjacentSum", "diagonalSum"]

[[[[1, 2, 0, 3], [4, 7, 15, 6], [8, 9, 10, 11], [12, 13, 14, 5]]], [15], [9]]

Output: [null, 23, 45]

Explanation:



The adjacent neighbors of 15 are 0, 10, 7, and 6.
The diagonal neighbors of 9 are 4, 12, 14, and 15.
 

Constraints:

3 <= n == grid.length == grid[0].length <= 10
0 <= grid[i][j] <= n2 - 1
All grid[i][j] are distinct.
value in adjacentSum and diagonalSum will be in the range [0, n2 - 1].
At most 2 * n2 calls will be made to adjacentSum and diagonalSum. */

class neighborSum {
    public int arr[][];
    public neighborSum(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        arr=new int[n][m];        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=grid[i][j];
            }
        }
    }
    
    public int adjacentSum(int value) {
        int n=arr.length;
        int m=arr[0].length;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(arr[i][j]==value)
                {
                    if(j-1>=0)
                    {
                        sum+=arr[i][j-1];
                    }
                    
                    if(j+1<m)
                    {
                        sum+=arr[i][j+1];
                    }
                    if(i+1 <n)
                    {
                        sum+=arr[i+1][j];
                    }
                    
                    if(i-1>=0)
                    {
                        sum+=arr[i-1][j];
                    }
                    
                    return sum;
                }
                
            }
            
        }
        
        return 0;
    }
    
    public int diagonalSum(int value) {
        int dsum=0;
         int n=arr.length;
        int m=arr[0].length;
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(arr[i][j]==value)
                {
                    if(i-1 >=0 && j-1 >=0)
                    {
                        dsum+=arr[i-1][j-1];
                    }
                    
                    if(i-1 >=0 && j+1 <m)
                    {
                        dsum+=arr[i-1][j+1];
                    }
                    
                    if(i+1 < n && j+1 <m)
                    {
                         dsum+=arr[i+1][j+1];
                    }
                    if(i+1 < n && j-1 >=0)
                    {
                         dsum+=arr[i+1][j-1];
                    }
                    
                    return dsum;
                }
            }
        }
        
        return 0;
        
    }
}

/**
 * Your neighborSum object will be instantiated and called as such:
 * neighborSum obj = new neighborSum(grid);
 * int param_1 = obj.adjacentSum(value);
 * int param_2 = obj.diagonalSum(value);
 */