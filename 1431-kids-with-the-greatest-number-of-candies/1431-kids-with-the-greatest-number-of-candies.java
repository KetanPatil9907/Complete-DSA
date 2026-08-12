class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
       int  maxc=0;
        for(int i=0;i<candies.length;i++){
            if(maxc<candies[i]){
                maxc=candies[i];
            }
        }
        for(int i=0;i<candies.length;i++){
            int c=candies[i]+extraCandies;
            if(c>=maxc){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return list;
    }
}