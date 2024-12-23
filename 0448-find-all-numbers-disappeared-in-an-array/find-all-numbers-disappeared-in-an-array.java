class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        cs(nums);
        List<Integer> l=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if( nums[i]-1!=i){
                l.add(i+1);
            }
        }
        return l;
    }
    static void cs(int[] arr){
        int i=0;
        while (i< arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else {
                i++;
            }
        }
    }
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
