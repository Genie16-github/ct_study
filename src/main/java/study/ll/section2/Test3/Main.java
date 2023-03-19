package study.ll.section2.Test3;
// 바이토닉 수열
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{1, 2, 3, 4, 5}));
    }
}

class Solution {
    public String solution(int[] nums){
        boolean chk = true;

        if (nums[1] <= nums[0]) return "NO";
        else{
            int s_num = nums[1];
            for (int i = 2; i < nums.length; i++){
                if (s_num == nums[i]) return "NO";
                if (chk){
                    if (s_num > nums[i]) chk = false;
                } else{
                    if (s_num < nums[i]) return "NO";
                }
            }
            return (chk) ? "NO" : "YES";
        }
    }
}
