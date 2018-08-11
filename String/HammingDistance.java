//add 0 and count
// which amazed me that this solution is quicker than below:
// using ^ and count 1
/**
*int res = 0, exc = x ^ y;
*for (int i = 0; i < 32; ++i) 
*{
*  res += (exc >> i) & 1;
*}
*return res;
*/

class Solution {
    public int hammingDistance(int x, int y) 
    {
        int count=0;
        String bx=Integer.toBinaryString(x);
        String by=Integer.toBinaryString(y);
        if(bx.length()==by.length())
        {
            for(int i=0;i<bx.length();i++)
            {
                if(bx.charAt(i)!=by.charAt(i))
                {
                    count++;
                }
            }
        }
        else if(bx.length()>by.length())
        {
            
            while(by.length()!=bx.length())
            {
                by="0"+by;
            }
            for(int i=0;i<bx.length();i++)
            {
                if(bx.charAt(i)!=by.charAt(i))
                {
                    count++;
                }
            }
        }
        else
        {
            while(by.length()!=bx.length())
            {
                bx="0"+bx;
            }
            for(int i=0;i<bx.length();i++)
            {
                if(bx.charAt(i)!=by.charAt(i))
                {
                    count++;
                }
            }
        }
        return count;
    }
}
