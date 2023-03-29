package study.ll.Section3.Test2;

import java.util.Stack;

// 괄호문자제거
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("(A(BC)D)EF(G(H)(IJ)K)LM(N)"));
    }
}

class Solution{
    public String solution(String s){
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()){
            if (c == ')'){
                char a = stack.pop();
                while (a != '('){
                    a = stack.pop();
                }
            } else{
                stack.push(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }

        return sb.reverse().toString();
    }
}
