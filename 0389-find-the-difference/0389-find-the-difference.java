class Solution {
    public char findTheDifference(String s, String t) {
        if(s.length()==0){
            return t.charAt(0);
        }
        int sum=0;
        for(int i=0;i<t.length();i++){
            sum+=(t.charAt(i)-'a');
        }
        for(int i=0;i<s.length();i++){
            sum-=(s.charAt(i)-'a');
        }
        
        return (char)(sum + 'a');
    }
}