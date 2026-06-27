class Solution{
    public int trap(int[]height){
        if(height==null||height.length==0)return 0;
        int ans=0;
        int l=0;
        int r=height.length-1;
        int lmax=height[l];
        int rmax=height[r];
        while(l<r){
            if(lmax<rmax){
                l++;
                if(height[l]>lmax){
                    lmax=height[l];
                }else{
                    ans+=lmax-height[l];
                }
            }else{
                r--;
                if(height[r]>rmax){
                    rmax=height[r];
                }else{
                    ans+=rmax-height[r];
                }
            }
        }
        return ans;
    }
}