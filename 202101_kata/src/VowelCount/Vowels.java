package VowelCount;

/**
 * @author dd
 * @version 1.0
 * @date 2021/1/27
 */
import java.util.*;

public class Vowels {

    public static int getCount(String str) {
        return (int)str.chars().mapToObj(i -> (char)i).filter(i -> "aeiou".contains(String.valueOf(i))).count();
    }

}
//public class Vowels {
//    public static int getCount(String str) {
//        int vowelsCount = 0;
//        for (char c : str.toCharArray()
//        ) {
//            switch (c) {
//                case 'a':
//                    vowelsCount++;
//                    break;
//                case 'e':
//                    vowelsCount++;
//                    break;
//                case 'i':
//                    vowelsCount++;
//                    break;
//                case 'o':
//                    vowelsCount++;
//                    break;
//                case 'u':
//                    vowelsCount++;
//                    break;
//                default:
//                    break;
//            }
//        }
//        return vowelsCount;
//    }
//}