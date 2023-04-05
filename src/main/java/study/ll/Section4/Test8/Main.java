package study.ll.Section4.Test8;

// 사과
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{3, 2, 1, 2, 1, 3}, new int[]{1, 0, 0, 1, 0, 0}, 3));
        System.out.println(new Solution().solution(new int[]{3, 2, 3, 2, 1, 3}, new int[]{1, 0, 0, 1, 0, 0}, 3));
    }
}

class Solution {
    public int solution(int[] apples, int[] power, int m) {
        int ans = 0;
        for (int i = 0; i <= power.length - m; i++) {
            int res = 0;
            int[] tmp = power.clone();
            for (int j = 0; j < m; j++) {
                tmp[i + j] += 1;
            }
            for (int k = 0; k < tmp.length; k++) {
                if (tmp[k] > 0) res += apples[k];
            }
            if (ans < res) ans = res;

        }
        return ans;
    }
}
