//really quick


class Solution {
    public boolean judgeCircle(String moves) {
        int [] xx= new int[128];
        xx[(int)('L')]=0;
        xx[(int)('U')]=0;
        xx[(int)('D')]=0;
        xx[(int)('R')]=0;
        char [] move=moves.toCharArray();
        for(char m:move)
        {
            xx[(int)m]++;
        }
        if(xx[(int)('L')]!=xx[(int)('R')]|xx[(int)('D')]!=xx[(int)('U')])
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
