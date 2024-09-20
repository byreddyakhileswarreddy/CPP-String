class Solution {
    public boolean halvesAreAlike(String s) {
        int mid = s.length() / 2;
        int count1 = countVowels(s, 0, mid);
        int count2 = countVowels(s, mid, s.length());
        
        return count1 == count2;
    }

    private int countVowels(String s, int start, int end) {
        int count = 0;
        for (int i = start; i < end; i++) {
            char ch = s.charAt(i);
            if (isVowel(ch)) {
                count++;
            }
        }
        return count;
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}
