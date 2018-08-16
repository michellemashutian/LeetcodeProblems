/*
*Input: 5
*Output: 2
*Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. 
*So you need to output 2.
*/


class Solution {
    public int findComplement(int num) {
        StringBuffer sb= new StringBuffer();
        String binary=String.valueOf(Integer.toBinaryString(num));
        for(int i=0;i<binary.length();i++)
        {
            if(binary.charAt(i)=='0') sb.append("1");
            if(binary.charAt(i)=='1') sb.append("0");
        }
        return Integer.valueOf(sb.toString(),2);
    }
}
