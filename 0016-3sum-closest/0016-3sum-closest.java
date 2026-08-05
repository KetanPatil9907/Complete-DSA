class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;
        int cloeset_sum =nums[0]+nums[1]+nums[2];
        int current_sum=0;
        for(int i=0;i<nums.length-2;i++){
            int left=i+1;
            int right=n-1;
            while(left<right){
            current_sum=nums[i]+nums[left]+nums[right];
            if((Math.abs(target-current_sum))<(Math.abs(cloeset_sum-target))){
                cloeset_sum=current_sum;
            }
            if(current_sum<target){
                left++;
            }
             else if(current_sum>target){
                right--;
            }
            else{
                return current_sum;
            }
        }
    }return cloeset_sum;
}
}