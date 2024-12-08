class Solution {
    public int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            String str=s.substring(0,i)+s.substring(i+1);
            String ch=Character.toString(s.charAt(i));
            if(!str.contains(ch)){
                return i;
            }
        }
        return -1;
    }
}
