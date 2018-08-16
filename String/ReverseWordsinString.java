//Input: "Let's take LeetCode contest"
//Output: "s'teL ekat edoCteeL tsetnoc"

class Solution {
    public String reverse(String input)
    {
        StringBuffer sb=new StringBuffer();
        char [] w=input.toCharArray();
        for(int i=w.length-1;i>-1;i--)
        {
            sb.append(Character.toString(w[i]));
        }
        return sb.toString();
        
    }
    public String reverseWords(String s) 
    {
        StringBuffer sbb=new StringBuffer();
        String [] xx=s.split(" ");
        for(int i=0;i<xx.length;i++)
        {
            sbb.append(reverse(xx[i])+" ");
        }
        return sbb.toString().trim();
    }
}
