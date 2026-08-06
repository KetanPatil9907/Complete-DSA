class Solution {
    public int maxProduct(int[] nums) {
        int max1=0;
        int secondmax =0;
        int a=nums.length;
        for(int i=0;i<a;i++){
            if(nums[i]>max1){
                secondmax =max1;
                max1=nums[i];
            }
            else{
                if(secondmax<nums[i]){
                    secondmax=nums[i];
            }
        }
        }
         int result=(max1-1)*(secondmax-1);
        return result;
    }
}