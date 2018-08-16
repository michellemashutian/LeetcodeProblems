
class Solution {
    public String reverseString(String s) {
        StringBuffer sb=new StringBuffer();
        for(int i=s.length()-1;i>-1;i--)
        {
            sb.append(Character.toString(s.charAt(i)));
        }
        return sb.toString();
    }
}
