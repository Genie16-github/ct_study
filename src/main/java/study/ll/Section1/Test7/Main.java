package study.ll.Section1.Test7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution("aaabc")));
    }
}

class Solution {
    public int[] solution(String s) {
        int[] ans = {0, 0, 0};
        for (char c : s.toCharArray()){
            switch (c) {
                case 'a' -> ans[0] += 1;
                case 'b' -> ans[1] += 1;
                case 'c' -> ans[2] += 1;
            }
        }

        int maxValue = Arrays.stream(ans).max().getAsInt();
        for (int i = 0; i < ans.length; i++){
            ans[i] = Math.abs(ans[i]-maxValue);
        }

        return ans;
    }
}