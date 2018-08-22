class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {      
        for(int i=0;i<matrix.length;i++)
        {
            int first=matrix[i][0];
            int index=0;
            while(index<matrix[0].length&&(i+index)<matrix.length)
            {
                int current = matrix[i+index][index];
                if(current!=first) return false;
                index++;
            }
        }

        for(int j=1;j<matrix[0].length;j++)
        {
            int first=matrix[0][j];
            int index=0;
            while(index<matrix.length&&(j+index)<matrix[0].length)
            {
                int current = matrix[index][index+j];
                if(current!=first) return false;
                index++;
            }
        }
        return true;
    }
}
