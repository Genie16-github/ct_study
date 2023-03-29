package study.ll.Section3.Test1;

import java.util.Stack;

// 올바른 괄호
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("(()(()))()"));
    }
}

class Solution {
    public String solution(String s){
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '(') stack.push(c);
            else if(c == ')') stack.pop();
        }
        return stack.empty() ? "YES" : "NO";
    }
}