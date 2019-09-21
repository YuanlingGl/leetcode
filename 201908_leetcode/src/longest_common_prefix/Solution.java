package longest_common_prefix;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";
        String prefix =strs[0];
        /*String str = "";
        for (String s:
             strs) {

        }

         */
        /*for(int i = 1;i<strs.length;i++){
            while(strs[i].indexOf(prefix)!=0){
                prefix = prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty())return "";
            }
        }

         */
        for(int i =0;i<strs.length;i++){
            while (strs[i].indexOf(prefix)!=0){
                prefix = prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }
}
