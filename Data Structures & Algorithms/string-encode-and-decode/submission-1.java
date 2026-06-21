class Solution {
    int[] size;
    public String encode(List<String> strs) {
        size=new int[strs.size()];
        String encoded_str="";
        for(int i=0;i<strs.size();i++){
            if(strs.get(i)=="") size[i]=0;
            else{
                size[i]=strs.get(i).length();
                encoded_str+=strs.get(i);
            }
        }
        return encoded_str;
    }

    public List<String> decode(String str) {
        int l=0;
        List<String> decoded_str=new ArrayList<>();
        for(int e:size){
            String d="";
            if(e!=0){
                d=str.substring(l,l+e);
                l+=e;
            }
            decoded_str.add(d);
        }
        return decoded_str;
    }
}
