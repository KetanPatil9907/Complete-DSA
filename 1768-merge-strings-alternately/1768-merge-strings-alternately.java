class Solution {
    public String mergeAlternately(String word1, String word2) {
        int a=word1.length();
        int b=word2.length();
        int x=0;
        int y=0;
        char alter1;
        String newstring ="";
        while(x<a && y<b){
             alter1=word1.charAt(x);
             newstring= newstring + alter1;
            x++;
             alter1=word2.charAt(y);
             newstring= newstring + alter1;
            y++;

        }
        while(x<a){
              alter1=word1.charAt(x);
              newstring= newstring + alter1;
            x++;
        }
        while(y<b){
             alter1=word2.charAt(y);
             newstring= newstring + alter1;
            y++;

        }
return newstring;
        
    } 
}