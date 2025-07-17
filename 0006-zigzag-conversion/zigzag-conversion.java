class Solution {
    public String convert(String s, int numRows) {
        if (s.length()==1 || numRows==1){
            return s;
        }

        List<Character>[] ans=new ArrayList[numRows];

        for (int i = 0; i < numRows; i++) {
            ans[i]=new ArrayList<>();
        }

        int index=0,d=0;
        for (char ch:s.toCharArray()){
            ans[index].add(ch);

            if (index==0){
                d=1;
            } else if (index==numRows-1) {
                d=-1;
            }
            index+=d;
        }

        String result="";
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].size(); j++) {
                result+=ans[i].get(j);
            }
        }
        return result;
    }
}
