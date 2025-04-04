// For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t 
//(i.e., t is concatenated with itself one or more times).
// Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.

// Example 1:
// Input: str1 = "ABCABC",1 str2 = "ABC"
// Output: "ABC"
// Example 2:
// Input: str1 = "ABABAB", str2 = "ABAB"
// Output: "AB"

 
class GcdOfStringsSolution {
    public String gcdOfStrings(String str1, String str2) {
        if (str2.length() > str1.length()) {
            return gcdOfStrings(str2, str1);
        } else if (str2.isEmpty()) {
            return str1;
        } else if (!str1.startsWith(str2)) {
            return "";
        } else {
            return gcdOfStrings(str1.substring(str2.length()), str2);
        }
    }
}