//writing function will make it quicker

class Solution 
{
    int invert(int x) 
    {
        return x == 1 ? 0 : 1;
    }
    public int[][] flipAndInvertImage(int[][] A) 
    {       
        for(int i=0; i<A.length;i++)
        {
            for(int j=0;j<A[0].length/2;j++)
            {
                int temp=A[i][j];
                A[i][j]=invert(A[i][A[0].length-1-j]);
                A[i][A[0].length-1-j]=invert(temp);
                
            }
             
            if(A[0].length%2==1)
            {
                A[i][A[0].length/2]=invert( A[i][A[0].length/2]);
            }   
        }
        return A;
    }
}
