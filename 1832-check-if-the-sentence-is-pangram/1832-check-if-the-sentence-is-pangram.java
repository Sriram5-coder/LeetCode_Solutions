class Solution {
    public boolean checkIfPangram(String sentence) {
        Map<Character,Integer>panmap=new HashMap<>();
        for(int i=0;i<sentence.length();i++)
        {
            char ch=sentence.charAt(i);
            if (panmap.containsKey(ch)) {
                panmap.put(ch, panmap.get(ch) + 1);
        	} else {
			    panmap.put(ch, 1);
	        }
        }
        if(panmap.size()==26)
        {
            return true; 
        }
        return false;
    }
}