import java.util.HashMap;

/**
 * @author wangpejian
 * @date 19-8-2 上午10:32
 */
public class N72_climbing_stairs {

    public static void main(String[] args) {
        System.out.println(new Solution72().climbStairs(3));
    }

}

class Solution72 {

    private int okStep = 0;
    private HashMap<Integer, Integer> cache = new HashMap<>();

    public int climbStairs(int n) {

        int s = foo(n);
        return s;

    }

    int foo(int n) {

        if (n == 0) {
            this.okStep++;
        }

        if (n < 0) {
            return -1;
        }

        int s1 = foo(n - 1);
        cache.put(n - 1, s1);

        int s2 = foo(n - 2);
        cache.put(n - 2, s2);

        return this.okStep;
    }
}
