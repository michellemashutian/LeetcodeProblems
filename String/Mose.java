/**Example:
*Input: words = ["gin", "zen", "gig", "msg"]
*Output: 2
*Explanation: 
*The transformation of each word is:
*"gin" -> "--...-."
*"zen" -> "--...-."
*"gig" -> "--...--."
*"msg" -> "--...--."
*There are 2 different transformations, "--...-." and "--...--.".
*/

//use char value to find mose code
//u can also use StringBuffer! which is quicker.

//StringBuffer bu = new StringBuffer();
//for(int i=0;i<w.length();i++)
//{              
//  bu.append(mose[(int)(w.charAt(i)-'a')]);
//}
//result.add(bu.toString()); 

            
class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        HashSet<String> result = new HashSet<String>();
        String [] mose = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for(String w: words)
        {
            String mo="";
            for(int i=0;i<w.length();i++)
            {
                mo=mo+mose[(int)(w.charAt(i)-'a')];
            }
            result.add(mo);               
        }
        return result.size();
        
    }
}
