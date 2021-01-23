import java.util.HashSet;
import java.util.Set;

/**
 * @author wangpejian
 * @date 19-8-2 上午10:32
 */
public class N3_alongest_substring_without_repeating_characters {

    public static void main(String[] args) {
        System.out.println(new Solution().lengthOfLongestSubstring("abcabcbb"));
    }

    static class Solution {
        // 暴利循环方案
        // public int lengthOfLongestSubstring(String s) {
        //     char[] ch = s.toCharArray();

        //         int max = 0;
        //         int cur = 0;

        //         Set<Character> set = new HashSet<>();
        //         for(int i = 0; i < ch.length; i++){

        //             if(ch.length - i < max){
        //                 break;
        //             }

        //             set.clear();
        //             cur = 0;
        //             for(int j = i; j < ch.length; j++){
        //                 if(!set.contains(ch[j])){
        //                     cur++;
        //                     set.add(ch[j]);
        //                 }else {
        //                     break;
        //                 }
        //             }

        //             max = Math.max(cur, max);
        //         }

        //         return max;
        // }

        // 滑动窗口
        public int lengthOfLongestSubstring(String s) {
            char[] ch = s.toCharArray();

            int max = 0;
            int right = 0;

            Set<Character> set = new HashSet<>();

            for (int left = 0; left < ch.length; left++) {

                for(;right< ch.length; right++){
                    if(!set.contains(ch[right])){
                        set.add(ch[right]);
                        max = Math.max(max, right - left + 1);
                    }else {
                        break;
                    }
                }

                set.remove(ch[left]);
            }

            return max;
        }
    }
}


