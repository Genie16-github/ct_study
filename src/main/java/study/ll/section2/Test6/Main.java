package study.ll.section2.Test6;
// 거리 두기
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{1, 0, 0, 0, 1, 0, 0, 1, 0, 1}));
    }
}

class Solution {
    public int solution(int[] nums){
        int max_cnt = 0;
        int zero_cnt = 0;
        for (int num : nums){
            if (num == 0) zero_cnt++;
            else {
                if (max_cnt < zero_cnt) max_cnt = zero_cnt;
                zero_cnt = 0;
            }
        }

        return (max_cnt % 2 == 0) ? max_cnt / 2 : (max_cnt / 2) +1;
    }
}