package yuan_quan_zhong_zui_hou_sheng_xia_de_shu_zi_lcof;

/**
 * @author dd
 * @version 1.0
 * @date 2020/11/6
 */
class Solution {
    public int lastRemaining(int n, int m) {
        int f = 0;
        for (int i = 2; i != n + 1; ++i) {
            f = (m + f) % i;
        }
        return f;
    }
}
