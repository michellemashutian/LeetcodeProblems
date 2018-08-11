/**
*You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  
*Each character in S is a type of stone you have.  
*You want to know how many of the stones you have are also jewels.
*The letters in J are guaranteed distinct, and all characters in J and S are letters. 
*Letters are case sensitive, so "a" is considered a different type of stone from "A".
*Example1:
*Input: J = "aA", S = "aAAbbbb"
*Output: 3
*Example2:
*Input: J = "z", S = "ZZ"
*Output: 0
*/

//when you meet string, try to use  "int [] XX= new int[128]" to save the string. 
//since you get char number.

class Solution {
    public int numJewelsInStones(String J, String S) 
    {
        int count=0;
        int [] jewel= new int[128];
        for(int i=0;i<J.length();i++)
        {
            jewel[(int)(J.charAt(i))]=1;
        }
        for(int i=0;i<S.length();i++)
        {
            if(jewel[(int)(S.charAt(i))]==1)
            {
               count++; 
            }
        }
        return count;
    }
}
