class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for(String word : words){
            boolean flag = true;
            char[] chararr = word.toCharArray();
            for(char c:chararr){
                if(allowed.indexOf(c)==-1){
                    flag = false;
                    break;
                }
            }
            if(flag) count++;
        }
        return count;
    }
}
