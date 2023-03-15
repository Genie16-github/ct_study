package study.ll.Section1.Test10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution(new String[]{"steasue", "sasseysu", "kseseas"})));
    }
}

class Solution {
    public String[] solution(String[] words){
        List<String> ans = new ArrayList<>();
        String[] tmp = new String[words.length];
        String str = words[0];
        for (char c : str.toCharArray()){
            for (int i = 1; i < words.length; i++){
                tmp[i] = words[i].replaceFirst(String.valueOf(c), "");
            }

            int cnt = 0;
            for (int i = 1; i < tmp.length; i++){
                if (tmp[i].length() != words[i].length()) {
                    words[i] = tmp[i];
                    cnt++;
                }
            }

            if (cnt == words.length-1) ans.add(String.valueOf(c));
        }
        return ans.toArray(new String[0]);
    }
}
