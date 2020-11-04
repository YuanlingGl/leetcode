package rotate_string;

class Solution {
    public boolean rotateString(String A, String B) {
        return A.length() + B.length() == A.length() * 2 && (A + A).contains(B);
    }
}