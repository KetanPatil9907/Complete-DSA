class Solution {
    public int[] rearrangeArray(int[] nums) {
        int x=0;
        int y=1;
        int n=nums.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                ans[x]=nums[i];
                
                x=x+2;
            }
            else{
                ans[y]=nums[i];
               
                y=y+2;
            }
        }
        return ans;
        
    }
}