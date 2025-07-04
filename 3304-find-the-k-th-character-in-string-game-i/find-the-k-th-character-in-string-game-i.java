class Solution {
    public char kthCharacter(int k) {
        String s="a";
        while (s.length()<k){
            int i=s.length(),j=0;
            while (j<i) {
                String chAdded;
                if (s.charAt(j) == 'z') {
                    chAdded = "a";
                } else {
                    chAdded = Character.toString(s.charAt(j) + 1);
                }
                s += chAdded;
                j++;
            }
        }
        return s.charAt(k-1);
    }
}
