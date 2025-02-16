// Input: word1 = "abc", word2 = "pqr"
// Output: "apbqcr"
// Explanation: The merged string will be merged as so:
// word1:  a   b   c
// word2:    p   q   r
// merged: a p b q c r
// Using string builder lets you save a ton of memory of is much faster because it is mutable
public class Main{
    public static void main(String[] args) {
        Solution s = new Solution();
        String answer = s.mergeAlternately("abc", "pqrs");
        System.out.println(answer);
    }
}
