/**
*On a N * N grid, we place some 1 * 1 * 1 cubes that are axis-aligned with the x, y, and z axes.
*Each value v = grid[i][j] represents a tower of v cubes placed on top of grid cell (i, j).
*Now we view the projection of these cubes onto the xy, yz, and zx planes.
*A projection is like a shadow, that maps our 3 dimensional figure to a 2 dimensional plane. 
*Here, we are viewing the "shadow" when looking at the cubes from the top, the front, and the side.
*Return the total area of all three projections.
*/

//try to understand the problem before coding
//front and right are obtained by bigges values sum of rows and columns

class Solution {
    public int projectionArea(int[][] grid) 
    {
        int top=0;
        int front=0;
        int right=0;
        for(int x=0;x<grid.length;x++)
        {
            int rowbig=0;
            for(int y=0;y<grid[0].length;y++)
            {
                if(grid[x][y]>0) top++;
                if(grid[x][y]>rowbig) rowbig=grid[x][y];                   
            }
            right=right+rowbig;
        }
        for(int y=0;y<grid[0].length;y++)
        {
            int colbig=0;
            for(int x=0;x<grid.length;x++)
            {
                if(grid[x][y]>colbig) colbig=grid[x][y];                   
            }
            front=front+colbig;
        }
        return top+right+front;
    }
}
