
//Implement function ToLowerCase() that has a string parameter str
//and returns the same string in lowercase.

//use  char[] ch = str.toCharArray();

class Solution {
    public String toLowerCase(String str) 
    {
        char[] ch = str.toCharArray();
    	for(int i=0;i<ch.length;i++)
    	{
    		if(((int)ch[i]>64) && ((int)ch[i]<91))
    		{
    			ch[i] = (char)((int)ch[i]+32);
    		}
    	}
    	
    	String childStr = String.valueOf(ch); 	
    	return childStr;

    }
}
