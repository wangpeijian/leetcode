/**
 * @author wangpejian
 * @date 19-8-2 上午10:32
 */
public class N67_add_binary {

    public static void main(String[] args) {
        System.out.println(new Solution().addBinary("111", "1"));
    }

    static class Solution {
        public String addBinary(String a, String b) {
            String[] ac;
            String[] bc;

            if (a.length() >= b.length()) {
                ac = a.split("");
                bc = b.split("");
            } else {
                ac = b.split("");
                bc = a.split("");
            }

            int up = 0;
            int ai = 0;
            int bi = 0;

            String res = "";
            for (int i = 0; i <= ac.length - 1; i++) {
                ai = Integer.parseInt(ac[ac.length - 1 - i]) ;
                if (bc.length - 1 - i < 0) {
                    bi = 0;
                } else {
                    bi = Integer.parseInt(bc[bc.length - 1 - i]);
                }

                switch (up + ai + bi) {
                    case 0:
                        res = "0" + res;
                        up = 0;
                        break;
                    case 1:
                        res = "1" + res;
                        up = 0;
                        break;
                    case 2:
                        res = "0" + res;
                        up = 1;
                        break;
                    case 3:
                        res = "1" + res;
                        up = 1;
                        break;
                }
            }

            if (up == 1) {
                res = "1" + res;
            }

            return res;
        }
    }
}


