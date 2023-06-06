class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int pre[]=new int[arr.length-1];
        for(int i=0;i<arr.length-1;i++)
        {
            pre[i]=arr[i+1]-arr[i];   
        }
        for(int i=0;i<pre.length-1;i++)
        {
            if(pre[i]!=pre[i+1])
            {
                return false;
            }
        }
        return true;
    }
}