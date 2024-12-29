class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String[] arr=s.split("\\s+");
        int len=arr.length;
        StringBuilder str=new StringBuilder();
        for (int i = len-1; i>0 ;i--) {
            str.append(arr[i]+" ");
        }
        str.append(arr[0].trim());
        return str.toString();
    }
}
