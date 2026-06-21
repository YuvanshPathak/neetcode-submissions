class Solution {
    public int[] productExceptSelf(int[] nums) {
        int p=1;
        int n=nums.length;
        int[] pre=new int[n];
        int[] post=new int[n];
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            pre[i]=p*nums[i];
            p=pre[i];
        }
        p=1;
        for(int i=n-1;i>=0;i--){
            post[i]=p*nums[i];
            p=post[i];
        }
        for(int i=0;i<n;i++){
            if(i==0) ans[i]=post[i+1];
            else if(i==n-1) ans[i]=pre[i-1];
            else ans[i]=pre[i-1]*post[i+1];
        }
        return ans;
    }
}