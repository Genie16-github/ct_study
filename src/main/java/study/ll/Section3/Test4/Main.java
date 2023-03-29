package study.ll.Section3.Test4;

import java.util.Stack;

// 쇠막대기
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("()(((()())(())()))(())"));
    }
}

class Solution {
    public int solution(String s){
        Stack<Character> stack = new Stack<>();
        char[] tmp = s.toCharArray();
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = tmp[i];
            if (c == '(') stack.push(c);
            else {
                if (tmp[i-1] == '('){
                    stack.pop();
                    ans += stack.size();
                } else {
                    ans++;
                    stack.pop();
                }
            }
        }

        return ans;
    }
}