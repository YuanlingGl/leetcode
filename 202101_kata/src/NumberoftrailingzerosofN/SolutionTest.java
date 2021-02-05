package NumberoftrailingzerosofN;

/**
 * @author dd
 * @version 1.0
 * @date 2021/2/1
 */
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class SolutionTest {
    @Test
    public void testZeros() throws Exception {
        assertThat(Solution.zeros(0), is(0));
        assertThat(Solution.zeros(6), is(1));
        assertThat(Solution.zeros(14), is(2));
        assertThat(Solution.zeros(5000), is(1249));
    }
}