package study.ll.section2.Test1;

import java.util.ArrayList;
import java.util.Arrays;
// 제곱수 정렬
public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution(new int[]{-4, -1, 0, 3, 10})));
    }
}

class Solution {
    public int[] solution(int[] nums){
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : nums){
            num = (int)(Math.pow(num, 2));

            if (list.size() == 0){
                list.add(num);
                continue;
            }
            for (int i = 0; i < list.size(); i++){
                if (num < list.get(i)){
                    list.add(i, num);
                    break;
                }
                else if (i == list.size()-1) {
                    list.add(num);
                    break;
                }
            }
        }

        return list.stream().mapToInt(e -> e).toArray();
    }
}
