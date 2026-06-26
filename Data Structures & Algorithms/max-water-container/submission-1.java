class Solution {
    public int maxArea(int[] heights) {
        int maxWater=0;
        int l=0;
        int r=heights.length-1;
        //int maxwater=(r-l)*Math.min(r,l);
        while(l<r){
            int cap=(r-l)*Math.min(heights[r],heights[l]);
            if(cap>maxWater) maxWater=cap;
            if(heights[l]<heights[r]) l++;
            else if(heights[l]>heights[r]) r--;
            else{
                l++;
                r--;
            }
        }
        return maxWater;
    }
}
