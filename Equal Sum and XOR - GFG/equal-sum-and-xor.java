//{ Driver Code Starts
//initial code
import java.util.*;

class EqualSumAndXor
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int a =sc.nextInt();
          
            GfG g=new GfG();
        
            System.out.println(g.countValues(a));
            t--;
        }
    }
}



// } Driver Code Ends


class GfG{
       /*you are required to complete this method */
	public int countValues(int n)
	{
            //Your code here
            int count=0;
            for(int i=0;i<=n;i++)
            {
                if((n+i)==(n^i))
                {
                    count++;
                }
            }
            return count;
	}
}
