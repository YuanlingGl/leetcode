package fan_zhuan_dan_ci_shun_xu_lcof;

class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        int i = s.length() - 1, j = i;
        StringBuilder stringBuilder = new StringBuilder();
        while (i >= 0) {
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }
            stringBuilder.append(s.substring(i+1,j+1)+" ");
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }
            j=i;
        }
        return stringBuilder.toString().trim();
    }
}