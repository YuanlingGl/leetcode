package unique_morse_code_words;

import java.util.HashSet;
import java.util.Set;

/**
 * @author dd
 * @version 1.0
 * @date 2020/11/4 15:34
 */
class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] MORSE = new String[]{".-","-...","-.-.","-..",".","..-.","--.",
                "....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-",
                "...-",".--","-..-","-.--","--.."};
        Set seen = new HashSet();
        for (String word : words){
            StringBuilder code = new StringBuilder();
            for (char s : word.toCharArray()){
                code.append(MORSE[s-'a']);
            }
            seen.add(code.toString());
        }
        return seen.size();
    }
}