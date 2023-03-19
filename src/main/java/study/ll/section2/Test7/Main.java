package study.ll.section2.Test7;
// 키보드
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("time to study", 7));
    }
}

class Solution {
    public int solution(String s, int n){
        int ans = s.length();
        s = s.replaceAll("\\s", "");
        while (s.length() > 0) {
            s = s.replaceAll(String.valueOf(s.charAt(0)), "");
            n--;
        }

        return (n >= 0) ? ans : -1;
    }
}
