class Solution {
    public String convertToBase7(int num) {
        int n=num;
        List<Integer> l1 = new ArrayList<>();
        int i = 0;
        num=Math.abs(num);
        while (num >0) {
            l1.add(i, num % 7);
            num = num / 7;
            i++;
        }
        while (!l1.isEmpty()) {
            num = num * 10 + (l1.remove(i - 1));
            i--;
        }
        if(n<0){
            return ("-"+num);
        }
        return Integer.toString(num);
    }
    }
