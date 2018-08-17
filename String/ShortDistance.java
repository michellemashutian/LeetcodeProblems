class Solution {

    public int slen(String input,char w, int index)
    {
        char [] c=input.toCharArray();
        int min=Math.abs(input.indexOf(Character.toString(w))-index);
        for(int j=0;j<c.length;j++)
        {
            char target=c[j];
            if(target==w)
            {
                int ln=Math.abs(j-index);
                if(min<=ln)
                {
                    continue;
                }
                else
                {
                    min=ln;
                }
            }
            
        }
        return min;
    }
    
    public int[] shortestToChar(String S, char C) {
        int [] result=new int[S.length()];
        char [] chars=S.toCharArray();
        for(int i=0;i<chars.length;i++)
        {
            result[i]=slen(S,C,i);
        }
        return result;
    }
}
