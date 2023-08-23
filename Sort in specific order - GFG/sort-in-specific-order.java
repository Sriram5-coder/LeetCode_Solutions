//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Solution ob = new Solution();
            ob.sortIt(a, n);
            StringBuilder output = new StringBuilder();
            for(int i=0;i<n;i++)
            output.append(a[i]+" ");
            System.out.println(output);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    
    public void sortIt(long arr[], long n)
    {
        //code here.
        
        long arr1[]=new long[(int)n];
        Arrays.sort(arr);
        int j=0;
        for(int i=(int)n-1;i>=0;i--)
        {
            
            if(arr[i]%2!=0)
            {
                arr1[j]=arr[i];
                arr[i]=0;
                j++;
            }
            
        }
        int point=0;
        for(int i=0;i<n;i++)
        {
            if(arr1[i]==0)
            {
                point=i;
                break;
            }
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                arr1[point]=arr[i];
                point++;
            }
            
            
        }
        for(int i=0;i<n;i++)
        {
            arr[i]=arr1[i];
        }
    }
}