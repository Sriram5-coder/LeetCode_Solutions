class Solution {
    public int maximum69Number (int num) {
        int n=0;
       int val=(int)Math.log10(num)+1;
        int ind=0;
        while(val!=0){
            n=num/(int)(Math.pow(10,val-1));
            n=n%10;
            if(n==6)
            {
                break;
            }
            val--;
        }
        return num+(int)(3*Math.pow(10,val-1));
    }
}