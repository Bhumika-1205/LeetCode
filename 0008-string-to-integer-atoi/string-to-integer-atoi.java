class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        int num=0,i=0;
        if (s.isEmpty()){
            return num;
        }
        boolean isNegative=s.charAt(0)=='-';
        boolean isPositive=s.charAt(0)=='+';
        if (isNegative || isPositive){
            i++;
        }
        while (i<s.length() && Character.isDigit(s.charAt(i))){
            int digit=s.charAt(i)-'0';

            if (num > Integer.MAX_VALUE / 10 || (num == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            num=num*10+digit;
            i++;
        }
        return isNegative?-num:num;
    }
}
