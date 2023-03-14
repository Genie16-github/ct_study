package study.ll.Section1.Test6;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("statitsics"));
    }
}

class Solution {
    public int solution(String s) {
        for (char c : s.toCharArray()){  // 문자열에서 문자 하나를 삭제
            String tmp = s.replace(String.valueOf(c), "");
            if (tmp.length() == s.length()-1) return s.indexOf(c)+1;
        }
        return -1;
    }
}