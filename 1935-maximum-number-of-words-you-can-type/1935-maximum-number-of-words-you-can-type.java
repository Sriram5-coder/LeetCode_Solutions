class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split("\\s+");
        int count = 0;
        
        for (String word : words) {
            boolean containsBrokenLetter = false;
            
            for (int i = 0; i < brokenLetters.length(); i++) {
                if (word.contains(Character.toString(brokenLetters.charAt(i)))) {
                    containsBrokenLetter = true;
                    break;
                }
            }
            
            if (!containsBrokenLetter) {
                count++;
            }
        }
        
        return count;
    }
}
