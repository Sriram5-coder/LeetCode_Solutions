class Solution {
    public int differenceOfSum(int[] nums) {
        int es=0;
        int ds=0;
        int r=0;
        for(int i=0;i<nums.length;i++)
        {
            es+=nums[i];
            if(nums[i]>9)
            {
                while(nums[i]!=0)
                {
                    r=nums[i]%10;
                    ds+=r;
                    nums[i]=nums[i]/10;
                }

            }
            else
                ds+=nums[i];
        }
        return es-ds;
    }
}