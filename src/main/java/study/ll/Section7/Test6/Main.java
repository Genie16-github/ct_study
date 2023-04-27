package study.ll.Section7.Test6;

import java.util.LinkedList;
import java.util.Queue;

// 타일 점프
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(
                new int[]{2, 2, 0, 2, 1, 1}));
        System.out.println(new Solution().solution(
                new int[]{1, 0, 1, 1, 3, 1, 2, 1}));
    }
}

class Solution {
    public int solution(int[] nums) {
        int endPoint = nums.length - 1;
        Queue<Integer> q = new LinkedList<>();
        int ans = 0;
        q.offer(0);
        while (!q.isEmpty()) {
            int len = q.size();
            for (int i = 0; i < len; i++) {
                int now = q.poll();
                if (now == endPoint) return ans;
                else {
                    for (int j = 1; j < nums[now] + 1; j++) {
                        int np = now + j;
                        if (np <= endPoint) q.offer(np);
                    }
                }
            }
            ans++;
        }

        return -1;
    }
}
