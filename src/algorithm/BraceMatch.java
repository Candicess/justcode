package algorithm;

import java.util.Stack;

/**
 * Created by huan on 2017/10/19.
 * 括号匹配
 * Ref: http://blog.devtang.com/2015/06/16/talk-about-tech-interview/
 */
public class BraceMatch {

    public boolean solution(String str) {
        if (str == null) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            char top = '0';
            if (!stack.isEmpty()) {
                top = stack.peek();
            }
            if (match(top, ch)) {
                // 匹配时直接出栈
                stack.pop();
            } else {
                // 不匹配时则入栈
                stack.push(ch);
            }
        }

        // 遍历完字符串后如果栈为空，则说明匹配
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 判断左右两个括号是否匹配
     * @param left ( [
     * @param right ) ]
     */
    public boolean match(char left, char right) {
        if (left == '(' && right == ')') {
            return true;
        }

        if (left == '[' && right == ']') {
            return true;
        }

        // 还有一些其他的类似匹配情况.....

        return false;
    }

    public static void main(String[] args) {
        String str = "([])";
//        String str = "([[])";
        System.out.println(new BraceMatch().solution(str));
    }
}