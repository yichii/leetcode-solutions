/*
// Input: word1 = "abc", word2 = "pqr"
// Output: "apbqcr"
// Explanation: The merged string will be merged as so:
// word1:  a   b   c
// word2:    p   q   r
// merged: a p b q c r
// Using string builder lets you save a ton of memory of is much faster because it is mutable
 */
class mergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < Math.max(word1.length(), word2.length()); i++) { 
            if (i < word1.length()) { 
                s.append(word1.charAt(i));
            }
            if (i < word2.length()) { 
                s.append(word2.charAt(i));
            }
        }
        return s.toString();
    }
}