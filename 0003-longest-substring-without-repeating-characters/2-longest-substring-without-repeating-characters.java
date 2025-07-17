class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length()==1){
            return 1;
        }
        
        int maxLength=0,right=0;
        String subStr="",ans="";
        
        while (right<s.length()){
            String ch=Character.toString(s.charAt(right));
            
            if(!subStr.contains(ch)){
                subStr+=ch;
            }
            
            else {
                int idx=subStr.indexOf(ch);
                subStr=subStr.substring(idx+1)+ch;
            }
            
            right++;
            maxLength=maxLength<subStr.length()?subStr.length():maxLength;
    }
    return maxLength;
}
}
