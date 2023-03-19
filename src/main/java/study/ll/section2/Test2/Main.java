package study.ll.section2.Test2;
// 가장 높은 증가수열
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{5, 2, 4, 7, 7, 3, 9, 10, 11}));
    }
}

class Solution {
    public int solution(int[] nums){
        int ans = 0;
        for (int i = 0; i < nums.length; i++){
            for (int j = i+1; j < nums.length; j++){
                if (nums[j-1] > nums[j]){
                    if (nums[j-1] - nums[i] > ans) ans = nums[j-1] - nums[i];
                    break;
                } else if (j == nums.length-1) {
                    if (nums[j] - nums[i] > ans) ans = nums[j] - nums[i];
                }
            }
        }
        return ans;
    }
}