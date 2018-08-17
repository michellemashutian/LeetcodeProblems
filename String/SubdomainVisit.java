class Solution {
    
    public HashMap<String,Integer> number(String input)
    {
        HashMap<String,Integer> map= new HashMap<String,Integer>();
        String [] x=input.split(" ");
        int count=Integer.parseInt(x[0]);
        String i=x[1];
        map.put(i,count);
        while(i.contains("."))
        {
            int index=i.indexOf(".");
            i=i.substring(index+1);
            map.put(i,count);            
        }
        return map;
        
    }
    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String,Integer> map= new HashMap<String,Integer>();
        List<String> result=new ArrayList<String>();
        
        for(int i=0;i<cpdomains.length;i++)
        {
            HashMap<String,Integer> mapx= new HashMap<String,Integer>();
            mapx=number(cpdomains[i]);
            for(Map.Entry<String, Integer> entry:mapx.entrySet())
    	 	{  
    	 		String x=entry.getKey();
    	 		int y=entry.getValue();
                //result.add(String.valueOf(x)+" "+y);
                if(map.containsKey(x))
                {
                   int count=map.get(x)+y;
                    map.put(x,count);
                }
                else
                {
                    map.put(x,y);
                } 
            }
        }
        
        for(Map.Entry<String, Integer> entry1:map.entrySet())
    	{  
    	 	String x=entry1.getKey();
    	 	int y=entry1.getValue();
            result.add(String.valueOf(y)+" "+x);
    	}
        return result;
    }
}
