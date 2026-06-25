class Solution{
public int lengthOfLongestSubstring(String s){
    int a=0,l=0;
    int[]m=new int[128];
    for(int r=0;r<s.length();r++){
        l=Math.max(m[s.charAt(r)],l);
        a=Math.max(a,r-l+1);
        m[s.charAt(r)]=r+1;}
    return a;
    }
}