class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> l=new ArrayList<>();
        int max=max(candies);
        for (int i = 0; i < candies.length; i++) {
            if (candies[i]+extraCandies>=max){
                l.add(true);
            }
            else{
                l.add(false);
            }
        }
        return l;
    }
    static int max(int[] arr){
        int maxElement=arr[0];
        for (int i=1;i< arr.length;i++){
            if (arr[i]>maxElement){
                maxElement=arr[i];
            }
        }
        return maxElement;
    }
}
