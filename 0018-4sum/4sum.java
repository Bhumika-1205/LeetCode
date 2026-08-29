class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);

        int len=nums.length;

        List<List<Integer>> ans=new ArrayList<>();

        for(int a=0;a<len;a++){
            if(a>0 && nums[a]==nums[a-1]) continue;
            for(int b=a+1;b<len;b++){
                if(b>a+1 && nums[b]==nums[b-1]) continue;
                int c=b+1,d=len-1;

                while(c<d){
                    long sum=(long)nums[a]+nums[b]+nums[c]+nums[d];

                    if(sum>target) d--;
                    else if(sum<target) c++;
                    else{
                        ans.add(Arrays.asList(nums[a],nums[b],nums[c],nums[d]));
                        c++;
                        d--;

                        while(c<d && nums[c]==nums[c-1]) c++;
                        while(c<d && nums[d]==nums[d+1]) d--;
                    }
                }
            }
        }
        return ans;
    }
}
