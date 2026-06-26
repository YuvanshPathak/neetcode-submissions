class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>>set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            //List<Integer>trip=new ArrayList<>();
            int l=i+1;
            int r=nums.length-1;
            while(l<r){
                List<Integer>trip=new ArrayList<>();
                if(nums[i]+nums[l]+nums[r]<0) l++;
                else if(nums[i]+nums[l]+nums[r]>0) r--;
                else{
                    trip.add(nums[i]);
                    trip.add(nums[l]);
                    trip.add(nums[r]);
                    l++;
                    r--;
                    set.add(trip);
                }
            }
        }
        List<List<Integer>>ans=new ArrayList(set);
        return ans;
    }
}
