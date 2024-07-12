class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s="";
        if(strs.length==1){
            return strs[0];
        }

        String f=strs[0];
        int j=0;

        while(j<f.length()){

            for(int i=0;i<strs.length-1;i++){
                if(j>=strs[i+1].length()){
                    s=strs[i].substring(0,j);
                    return s;
                }
                if(j<strs[i+1].length() &&  (strs[i].charAt(j)!=strs[i+1].charAt  (j))){
                    s=strs[i].substring(0,j);
                    return s;
                }
                s=strs[i].substring(0,j+1);
            }
            j++;
        }
        return s;
    }
}
