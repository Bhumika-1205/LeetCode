class Solution {
    public String toLowerCase(String s) {
        String str="";
        for(int i=0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i))){
                str+=Character.toString(Character.toLowerCase(s.charAt(i)));
            }
            else{
                str+=Character.toString(s.charAt(i));
            }
        }
        return str;
    }
}
