package diving_boar_lcci;

public class Demo {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.divingBoard(1,1,0).length);
        for (int i:solution.divingBoard(1,1,100)){
            System.out.println(i);
        }
    }
}
