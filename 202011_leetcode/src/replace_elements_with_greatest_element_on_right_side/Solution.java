package replace_elements_with_greatest_element_on_right_side;

/**
 * @author dd
 * @version 1.0
 * @date 2020/11/6
 */
class Solution {
    public int[] replaceElements(int[] arr) {
        int maxRightNum = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = maxRightNum;
            if (temp > maxRightNum) {
                maxRightNum = temp;
            }
        }
        return arr;
    }
}