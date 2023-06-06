class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int pre[]=new int[arr.length];
        pre[0]=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            pre[i]=pre[i-1]+arr[i];
        }
        int sum=pre[arr.length-1];
        int i=2;
        while(i<arr.length)
        {
            sum+=pre[i];
            for(int j=i+1;j<arr.length;j++)
            {
                sum+=pre[j]-pre[j-i-1];
            }
            i=i+2;
        }
        return sum;
    }
}