package fib;

/**
 * @author dd
 * @version 1.0
 * @date 2021/1/4
 */
class Solution1 {
    public int fib(int n) {
        int[] a = new int[30];
        a[0] = 0;
        a[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            a[i] = a[i - 2] + a[i - 1];
        }
        return a[n];
    }
}

class Solution {
    public int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int a = 0, b = 1, c = 0, z = 2;
        while (z < n + 1) {
            c = a + b;
            a = b;
            b = c;
            z++;
        }
        return c;
    }
}

class Demo {
    public static void main(String[] args) {
        Solution solution = new Solution();
        for (int i = 0; i <= 30; i++) {
            System.out.println(i + " " + solution.fib(i));
        }
    }
}