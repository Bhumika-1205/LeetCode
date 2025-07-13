class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);
        List<Integer> l=new ArrayList<>();
        int element=nums[0],count=0,i=0;
        while (i< nums.length){
            if (nums[i]==element){
                count++;
            }
            else{
                if(count>nums.length/3){
                    l.add(element);
                }
                count=1;
                element=nums[i];
            }
            i++;
        }
        if(count>nums.length/3){
            l.add(element);
        }
        return l;
    }
}
