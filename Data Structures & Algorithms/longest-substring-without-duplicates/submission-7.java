class Solution{
public int lengthOfLongestSubstring(String s){
    HashMap<Character,Integer>map=new HashMap<>();
    if(s==null||s.isEmpty()) return 0;
    else{
    int l=0;
    int r=0;
    int maxLen=1;
    while(r<s.length()){
        char ch=s.charAt(r);
        if(!map.containsKey(ch)||map.get(ch)<l){
            map.put(ch,r);
            if((r-l+1)>maxLen) maxLen=r-l+1;
        }
        else{
            l=map.get(ch)+1;
            map.put(ch,r);
            if((r-l+1)>maxLen) maxLen=r-l+1;
        }
        r++;
    }
    return maxLen;
    }
}
}