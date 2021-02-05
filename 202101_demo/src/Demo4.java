import java.util.stream.LongStream;

/**
 * @author dd
 * @version 1.0
 * @date 2021/1/29
 */
public class Demo4 {
    public static void main(String[] args) {
        for (long i:LongStream.range(1,10).toArray()
             ) {
            System.out.print(i);
        }
    }
}
