package VowelCount;

/**
 * @author dd
 * @version 1.0
 * @date 2021/1/27
 */
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class VowelsTest {
    @Test
    public void testCase1() {
        assertEquals("Nope!", 5, Vowels.getCount("abracadabra"));
    }

}