class Solution {
    public void moveZeroes(int[] nums) {
        int a=0;
        int b=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                b++;
            }
            else{
                int temp=nums[a];
                nums[a]=nums[b];
                nums[b]=temp;
                a++;
                b++;

            }

        
        
    }
    
}
}