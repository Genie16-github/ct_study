package study.ll.Section1.Test2;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("Moon"));
    }
}

class Solution {
    public String solution(String s) {
        s = s.toLowerCase();
        for (int i = 0; i < s.length()/2; i++){
            if (s.charAt(i) != s.charAt(s.length()-1-i)) return "NO";
        }
        return "YES";
    }
}