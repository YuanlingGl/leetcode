package valid_mountain_array;

public class Demo {
    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        int[] a = {3, 5, 5};
        int[] b = {0, 3, 2, 1};
        int[] c = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] d = {0, 1, 2, 1, 2};
        int[] e = {9,8,7,6,5,4,3,2,1,0};
        System.out.println(solution.validMountainArray(e));
    }
}
