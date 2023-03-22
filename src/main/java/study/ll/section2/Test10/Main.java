package study.ll.section2.Test10;

import java.util.*;

// 회장선거
public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution(4,
                new int[][]{{0, 1}, {0, 3}, {1, 2}, {2, 0}, {2, 3}, {3, 0}}, 2)));
    }
}

class Solution {
    public int[] solution(int n, int[][] rec, int k) {
        int[] chk = new int[n];
        int[] ans = new int[n];
        for (int[] a : rec) {
            chk[a[1]]++;        // 추천 받은 사람
            ans[a[0]]++;        // 추천 한 사람
        }
        // System.out.println(Arrays.toString(chk));
        for (int i = 0; i < chk.length; i++) {
            if (chk[i] < k) {   // 당선 안 된 사람
                for (int[] c : rec){
                    if (c[1] == i) ans[c[0]]--;
                }
            }
        }
        return ans;
    }
}