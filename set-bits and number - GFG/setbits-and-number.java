//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.bitMultiply(N));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int bitMultiply(int N){
        // coe here
        int count=0;
        String x="";
        int n=N;
        while(n > 0)
        {
            int a = n % 2;
            x = a + x;
            n = n / 2;
        }
        int l = x.length();
        for(int i = 0; i < l; i++)
        {
            if(x.charAt(i) == '1')
            {
                count++;
            }
        }
        return N*count;
        
    }
}