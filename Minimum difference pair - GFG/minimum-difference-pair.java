//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine().trim();
            String[] S = s.split(" ");
            int[] nums = new int[n];
            for(int i = 0; i < n; i++)
                nums[i] = Integer.parseInt(S[i]);
            Solution ob = new Solution();
            int ans = ob.minimum_difference(nums);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int minimum_difference(int[] nums)
    {
        // code here
        Arrays.sort(nums);
        int min_dif=Math.abs(nums[0]-nums[1]);
        for(int i=1;i<nums.length-1;i++)
        {
            int dif=Math.abs(nums[i]-nums[i+1]);
            if(min_dif>dif)
            {
                min_dif=dif;
            }
        }
        return min_dif;
        
    }
}