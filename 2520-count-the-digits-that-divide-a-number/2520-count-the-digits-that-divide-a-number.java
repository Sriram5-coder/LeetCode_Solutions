class Solution {
    public int countDigits(int num) {
        int val=0;
        int cnt=0;
        int num1=num;
        while(num!=0)
        {
            val=num%10;
            if(num1%val==0)
            {
                cnt++;
            }
            val=0;
            num=num/10;
            
        }
        return cnt;
    }
}