class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length==1) return intervals;

        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int s=intervals[0][0],l=intervals[0][1];

        List<int[]> ans=new ArrayList<>();

        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=l){
                l=Math.max(l,intervals[i][1]);
            }else{
                ans.add(new int[]{s,l});
                s=intervals[i][0];
                l=intervals[i][1];
            }
        }
        ans.add(new int[]{s,l});

         return ans.toArray(new int[0][]);

    }
}
