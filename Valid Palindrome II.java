class Solution {
    public boolean check(String s,int start,int end){
        while(start < end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;

    }
    public boolean validPalindrome(String s) {
        int start=0;
        int end=s.length()-1;
        while(start < end){
            if(s.charAt(start)!=s.charAt(end)){
                return check(s,start+1,end) || check(s,start,end-1);
            }else{
                start++;
                end--;

            }

        } 
        return true;
        
    }
}
