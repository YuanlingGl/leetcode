package demo20210118;

import java.util.Arrays;
import java.util.List;

/**
 * @author dd
 * @version 1.0
 * @date 2021/1/19
 */
public class Demo2 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl","\\t");
        // 获取空字符串的数量
        long count = strings.stream().filter(String::isBlank).count();
        System.out.println(count);
    }
}
