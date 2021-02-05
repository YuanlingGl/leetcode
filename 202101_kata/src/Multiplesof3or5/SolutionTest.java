package Multiplesof3or5;

/**
 * @author dd
 * @version 1.0
 * @date 2021/1/27
 */
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        assertEquals(14, new Solution().solution(9));
    }

}