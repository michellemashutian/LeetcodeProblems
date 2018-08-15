
//return new String[0];


class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        StringBuffer sb = new StringBuffer();
        HashMap<String,Double> map1=new HashMap<String,Double>();
        HashMap<String,Double> map2=new HashMap<String,Double>();
        String [] aa=A.split(" ");
        String [] bb=B.split(" ");
        for(int i=0;i<aa.length;i++)
        {
            if(map1.containsKey(aa[i]))
            {
                Double count=map1.get(aa[i])+1;
                map1.put(aa[i],count);
            }
            else
            {
                map1.put(aa[i],1.0);
            }
        }
        for(int i=0;i<bb.length;i++)
        {
            if(map2.containsKey(bb[i]))
            {
                Double count=map2.get(bb[i])+1;
                map2.put(bb[i],count);
            }
            else
            {
                map2.put(bb[i],1.0);
            }
        }
        int index=0;
        for(Map.Entry<String, Double> entry:map1.entrySet())
    	{  
    	 	String x=entry.getKey();
            Double y=entry.getValue();
    	 	if(!map2.containsKey(x)&&y==1.0&&x!=null) 
            {
                if(x.length()>0)
                {
                    sb.append(x+"\t");
                    index++; 
                }

            }            
    	}
        for(Map.Entry<String, Double> entry:map2.entrySet())
    	{  
    	 	String x=entry.getKey();
            Double y=entry.getValue();
    	 	if(!map1.containsKey(x)&&y==1.0&&x!=null) 
            {
                if(x.length()>0)
                {
                    sb.append(x+"\t");
                    index++; 
                }
            }            
    	}
        String x=sb.toString().trim();
        if(x.length()==0)
        {
            return new String[0];
        }
        String [] str = x.split("\t");
        return str;
    }
}
