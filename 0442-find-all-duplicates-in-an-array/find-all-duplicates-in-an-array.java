class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> l=new ArrayList<>();
        cs(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                l.add(nums[i]);
            }
        }
        return l;
    }
    static void cs(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
    }
    static void swap(int[] arr, int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
