package study.ll.Section3.Test3;

import java.util.Arrays;
import java.util.Stack;

// 충돌하는 수열
public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution(new int[]{-2, -1, -3, 1, 3})));
    }
}

class Solution {
    public int[] solution(int[] nums){
        Stack<Integer> stack = new Stack<>();
        stack.push(nums[0]);
        for (int i = 1; i < nums.length; i++){
            if (stack.peek() < 0) stack.push(nums[i]);
            else if (stack.peek() > 0 && nums[i] < 0){
                int tmp = stack.pop();
                if (Math.abs(tmp) > Math.abs(nums[i])) stack.push(tmp);
                else if (Math.abs(tmp) < Math.abs(nums[i])) stack.push(nums[i]);
            }
            else stack.push(nums[i]);
        }
        return stack.stream().mapToInt(e -> e).toArray();
    }
}
