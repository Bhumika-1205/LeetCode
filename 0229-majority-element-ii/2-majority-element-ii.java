class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cnt1=0,cnt2=0,el1=nums[0],el2=nums[0];
        List<Integer> ans=new ArrayList<>();
        for (int num:nums) {
            if((cnt1==0 && num!=el2) || num==el1){
                cnt1++;
                el1=num;
            } else if ((cnt2==0 && num!=el1) || num==el2) {
                cnt2++;
                el2=num;
            }else{
                cnt1--;
                cnt2--;
            }
        }

        int c1=0,c2=0;
        for (int i=0;i< nums.length;i++){
            if (nums[i]==el1){
                c1++;
            }
            else if (nums[i]==el2){
                c2++;
            }
        }
        if (c1> nums.length/3){
            ans.add(el1);
        }if ( c2> nums.length/3){
            ans.add(el2);
        }
        return ans;
    }
}
