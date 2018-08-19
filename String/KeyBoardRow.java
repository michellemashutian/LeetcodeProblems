class Solution {
    public boolean isexisted(String input)
    {
        List<String> l1 = Arrays.asList("a","s","d","f","g","h","j","k","l");
        List<String> l2 = Arrays.asList("z","x","c","v","b","n","m");
        List<String> l3 = Arrays.asList("q","w","e","r","t","y","u","i","o","p");
        String first=Character.toString(input.charAt(0)).toLowerCase();
        if(l1.contains(first))
        {
           for(int j=1;j<input.length();j++)
            {           
                if(!l1.contains(Character.toString(input.charAt(j)).toLowerCase()))
                {
                    return false;
                }
            } 
        }
        else if(l2.contains(first))
        {
           for(int j=1;j<input.length();j++)
            {           
                if(!l2.contains(Character.toString(input.charAt(j)).toLowerCase()))
                {
                    return false;
                }
            } 
        }           
        else if(l3.contains(first))
        {
           for(int j=1;j<input.length();j++)
            {           
                if(!l3.contains(Character.toString(input.charAt(j)).toLowerCase()))
                {
                    return false;
                }
            } 
        }            
        return true;                  
    }
    public String[] findWords(String[] words) {
        List<String> list=new ArrayList<String>();  
        for(int i=0;i<words.length;i++)
        {
            String word=words[i];
            if(isexisted(word))
            {
               list.add(word);
            } 
        }
        int size=list.size();
         String[] array = (String[])list.toArray(new String[size]);  
        return array;
    }
}
