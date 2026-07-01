class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer>map=new HashMap<>();
        if(s.length()==1) return 1;
        else{
        int maxFreq=0;
        int maxLen=0;
        int l=0;
        int r=0;
        while(r<s.length()){
            char ch=s.charAt(r);
            map.put(ch,map.getOrDefault(ch,0)+1);
            maxFreq=Math.max(maxFreq,map.get(ch));
            if(r-l+1-maxFreq>k){
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                l++;
                // r++;
            }
            maxLen=Math.max(maxLen,r-l+1);
            r++;
        }
        return maxLen;
    }
    }
}
