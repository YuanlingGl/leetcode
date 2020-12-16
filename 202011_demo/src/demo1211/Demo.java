package demo1211;

/**
 * @author dd
 * @version 1.0
 * @date 2020/12/11
 */
public class Demo {
    public static void main(String[] args) {

        String date = "20201010";
        StringBuilder sb = new StringBuilder();
        sb.append(date.substring(0,4)).append("-").append(date.substring(4,6)).append("-").append(date.substring(6,8));
        System.out.println(sb.toString());
    }
//    private String dateformat(Integer date){
//
//    }
}
