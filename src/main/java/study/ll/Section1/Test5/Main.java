package study.ll.Section1.Test5;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("BACBACCACCBDEDE"));
    }
}

class Solution {
    public String solution(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('A', 0);
        map.put('B', 0);
        map.put('C', 0);
        map.put('D', 0);
        map.put('E', 0);

        for (char c : s.toCharArray()){     // 문자(키)로 값을 찾아서 +1
            map.put(c, map.get(c)+1);
        }

        // 최대값(Value)의 키를 구함
        Character maxKey = map.keySet().stream()
                .max(Comparator.comparing(map::get))
                .orElse(null);

        return String.valueOf(maxKey);
    }
}