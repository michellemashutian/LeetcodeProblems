//needs to be improved

class Solution {
    public boolean isdivding(int input)
    {
        char[] charlist = String.valueOf(input).toCharArray();
        for(int i =0;i< charlist.length;i++)
        {
            if(charlist[i]=='0') return false;
            if(input%(Integer.parseInt(Character.toString(charlist[i])))!=0) return false;
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) 
    {
       List<Integer> result= new ArrayList<Integer>();
        for(int i=left;i<right+1;i++)
        {
            if(isdivding(i))
            {
                result.add(i);
            }
        }
        return result;
    }
    
}
