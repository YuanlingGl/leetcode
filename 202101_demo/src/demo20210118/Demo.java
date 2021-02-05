package demo20210118;

/**
 * @author dd
 * @version 1.0
 * @date 2021/1/18
 */
public class Demo {
}

class TestIt {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3};
        ChangeIt.doIt2(myArray);
        for (int j = 0; j < myArray.length; j++) {
            System.out.println(myArray[j] + " ");
        }
    }
}

class ChangeIt {
    static void doIt(int[] z) {
        z = null;
    }

    static void doIt2(int[] z) {
        int[] A = z;
        A[0] = 99;
    }
}