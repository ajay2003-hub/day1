class Solution {
    public int strStr(String haystack, String needle) {
        int hLn=haystack.length();
        int nLn=needle.length();
        for(int i=0;i<=(hLn-nLn);i++){
            if(haystack.substring(i,nLn+i).equals(needle)){
                return i;
            }
            
        }
        return -1;
        
        
    }
}
