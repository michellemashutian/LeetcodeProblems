/**
*A self-dividing number is a number that is divisible by every digit it contains.
*For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
*Also, a self-dividing number is not allowed to contain the digit zero.
*Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.
*/

//needs to be improved

class Solution {
    public boolean isdivding(int input)
    {
        char[] charlist = String.valueOf(input).toCharArray();
        for(int i =0;i< charlist.length;i++)
        {
            if(charlist[i]=='0') return false;
            if(input%(Character.getNumericValue(charlist[i]))>0) return false;
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
