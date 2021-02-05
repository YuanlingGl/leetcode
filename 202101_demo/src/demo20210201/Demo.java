package demo20210201;

/**
 * @author dd
 * @version 1.0
 * @date 2021/2/1
 */
public class Demo {
    public static void main(String args[]) {
        for (int counter = 0; counter <= 25; counter++) {
            System.out.printf("%d! = %d\n", counter,
                    factorial(counter));
        }
    }

    public static long factorial(long number) {
        if (number <= 1)
            return 1;
        else
            return number * factorial(number - 1);
    }
}
