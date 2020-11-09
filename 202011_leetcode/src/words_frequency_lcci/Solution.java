package words_frequency_lcci;

import java.util.HashMap;
import java.util.Map;

/**
 * @author dd
 * @version 1.0
 * @date 2020/11/9
 */
class WordsFrequency {
    Map<String,Integer> map = new HashMap();
    public WordsFrequency(String[] book) {
//        for (String bok : book){
//            if (map.containsKey(bok)){
//                map.put(bok,map.get(bok)+1);
//            }else {
//                map.put(bok,1);
//            }
//        }
        // getOrDefault 有key取key，无key取默认值
        //
        for (String word : book) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        return;
    }

    public int get(String word) {
        return map.get(word)==null ? 0 : map.get(word);
    }
}