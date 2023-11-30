class Solution {
    public boolean check(int[] nums) {
        int cn=0;
        for(int i=0;i<nums.length-1;i++)
        {
            if((nums[i]>nums[i+1]))
                cn++;
                
        }
        if(cn==0)
            return true;
        else if(cn>1)
            return false;
        else if(nums[0]>=nums[nums.length-1])
            return true;
        else
            return false;
    }
}
