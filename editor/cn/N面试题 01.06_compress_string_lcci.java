// 字符串压缩 2022-02-10 10:35:01

//字符串压缩。利用字符重复出现的次数，编写一种方法，实现基本的字符串压缩功能。比如，字符串aabcccccaaa会变为a2b1c5a3。若“压缩”后的字符串没
//有变短，则返回原先的字符串。你可以假设字符串中只包含大小写英文字母（a至z）。 
//
// 示例1: 
//
// 
// 输入："aabcccccaaa"
// 输出："a2b1c5a3"
// 
//
// 示例2: 
//
// 
// 输入："abbccd"
// 输出："abbccd"
// 解释："abbccd"压缩后为"a1b2c2d1"，比原字符串长度更长。
// 
//
// 提示： 
//
// 
// 字符串长度在[0, 50000]范围内。 
// 
// Related Topics 双指针 字符串 
// 👍 117 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String compressString(String S) {
        if("".equals(S)){
            return S;
        }

        char[] chars = S.toCharArray();
        String[] res = new String[chars.length];

        int p = 0;
        char pre = '0';
        char c;
        int count = 1;
        for (int i = 0; i <= chars.length; i++) {
            c = i < chars.length ? chars[i] : ' ';

            if (i == 0) {
                res[p++] = String.valueOf(c);
                pre = c;
            } else {

                if(pre == c){
                    count++;
                }else {
                    if(p >= chars.length){
                        return S;
                    }

                    res[p++] = String.valueOf(count);

                    if(p >= chars.length){
                        return S;
                    }

                    if(i < chars.length){
                        res[p++] = String.valueOf(c);
                        count = 1;
                        pre = c;
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(String s : res){
            if(s != null){
                sb.append(s);
            }
        }

        String resStr = sb.toString();
        return resStr.length() > chars.length ? S : resStr;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
