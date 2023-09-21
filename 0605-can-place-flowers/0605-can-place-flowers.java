class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int cnt=0;
        if(n==0)
        {
            return true;
        }
        int len=flowerbed.length;
        if(len==1)
        {
            if(flowerbed[0]==0 && n==1) return true;
            else return false;
        }
        if(flowerbed[0]==0 && flowerbed[1]==0)
        {
            n--;
            flowerbed[0]=1;
        }
        for(int i=1;i<len-1;i++){
            if(flowerbed[i]==0 && flowerbed[i-1]==0 && flowerbed[i+1]==0){
                if(n>0){
                    n--;
                    flowerbed[i]=1;
                }
                else return true;
            }
        }
        if(n>0 && flowerbed[len-1]==0&&flowerbed[len-2]==0){
            n--;
        }
        return (n==0);  
    }
}