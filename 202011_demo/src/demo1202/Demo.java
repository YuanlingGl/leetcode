package demo1202;

import java.math.BigDecimal;

/**
 * @author dd
 * @version 1.0
 * @date 2020/12/2
 */
public class Demo {
    private static final BigDecimal YEAR_RATE = BigDecimal.valueOf(0.0395);
    private static final Integer A_MONTH = 30;

    public static void main(String[] args) {
        BigDecimal dayRate = YEAR_RATE.divide(BigDecimal.valueOf(360),2);
        BigDecimal amt = BigDecimal.valueOf(5000);
        int i = 0;
        BigDecimal j = dayRate.add(BigDecimal.valueOf(1));
        while (i < 1) {
            amt = amt.multiply(j);
            i++;
        }
        System.out.println(amt);
    }
}
