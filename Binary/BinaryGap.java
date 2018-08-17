class Solution {
    public int binaryGap(int N) {
        String binary=String.valueOf(Integer.toBinaryString(N));
        int max=0;   
        int len=0;
        int count=0;
        for(int i=0;i<binary.length();i++)
        {           
            String x=Character.toString(binary.charAt(i));
            if(x.equals("1"))
            {
                len++;
                count++;
                if(max<len)
                {
                    max=len;
                }
                if(len==0)
                {
                    continue;
                }
                else
                {
                    len=0;
                }
            }
            else
            {
                len++;
            }
        }
        if(count==1) return 0;
        return max;

    }
}
