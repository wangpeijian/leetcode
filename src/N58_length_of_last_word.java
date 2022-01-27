public class N58_length_of_last_word {

    public static void main(String[] args) {
        System.out.println(new Solution().lengthOfLastWord("luffy is still joyboy"));
    }

    static class Solution {
        public int lengthOfLastWord(String s) {
           char[] chars = s.toCharArray();

            int n = 0;
            for (int i = chars.length - 1; i >= 0; i--) {
                if(chars[i] == ' '){
                    if(n == 0){
                        continue;
                    }else {
                        break;
                    }
                }

                if(chars[i] != ' '){
                    n++;
                }
            }

            return n;
        }
    }

}
