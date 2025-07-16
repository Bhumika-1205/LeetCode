class Solution {
    private static String[] arr={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public List<String> letterCombinations(String digits) {
        List<String> l=new ArrayList<>();
        if(digits.isEmpty()){
            return l;
        }

        else if(digits.length()==1){
            char ch= digits.charAt(0);
            String index=arr[ch-'2'];
            for (int i = 0; i < index.length(); i++) {
                l.add("" +index.charAt(i));
            }
            return l;
        }

        List<String> b=letterCombinations(digits.substring(1));
        char ch= digits.charAt(0);
        String index=arr[ch-'2'];

        for (int i = 0; i <index.length(); i++) {
            for (int j = 0; j < b.size(); j++) {
                l.add(index.charAt(i)+b.get(j));
            }
        }
        return l;
    }
}
