package demo20210118;

/**
 * @author dd
 * @version 1.0
 * @date 2021/1/27
 */
public class Demo3 {
    public static void main(String[] args) {
        int sum =0;
        int a=18;
        a--;
        for (int i = 1; i <= a / 3; i++) {
//            System.out.println(i);
            sum += i * 3;
        }
        for (int i = 1; i <= a/ 5; i++) {
//            System.out.println(i);
            sum += i * 5;
        }

        System.out.println(sum);
//        System.out.println(10/3);
    }
}
