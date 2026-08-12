class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int low=0;
        int hight=k-1;
        int windowsum=0;
        for(int i=0;i<k;i++){
            windowsum=windowsum+nums[i];
        }
        int max_sum=windowsum;
        while(hight<nums.length-1){
            windowsum=windowsum-nums[low];
            low++;
            hight++;
            windowsum=windowsum+nums[hight];
            max_sum=Math.max(windowsum,max_sum);
        }
        return (double) max_sum / k;
    }
}