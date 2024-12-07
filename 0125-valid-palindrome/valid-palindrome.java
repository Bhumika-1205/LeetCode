class Solution {
    public boolean isPalindrome(String s) {        
        s=s.toLowerCase();
        String newString="";
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>='a' && s.charAt(i)<='z' )|| (s.charAt(i)-'0'>=0 && s.charAt(i)-'0'<=9)){
                newString+=s.charAt(i);
            }
        }
        String revString="";
        for(int i=newString.length()-1;i>-1;i--){
            revString+=newString.charAt(i);
        }
        if(newString.equals(revString)){
            return true;
        }
        return false;
    }
}
