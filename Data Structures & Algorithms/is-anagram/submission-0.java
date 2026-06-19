class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer>freq1=new HashMap<>();
        Map<Character,Integer>freq2=new HashMap<>();
        boolean ans=true;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(freq1.containsKey(ch))
            freq1.put(ch,freq1.get(ch)+1);
            else freq1.put(ch,1);
        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(freq2.containsKey(ch))
            freq2.put(ch,freq2.get(ch)+1);
            else freq2.put(ch,1);
        }
        if(freq1.equals(freq2)) ans=true;
        else ans=false;
        return ans;
    }
}
