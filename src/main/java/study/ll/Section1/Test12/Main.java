package study.ll.Section1.Test12;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new String[]{"01:00", "08:00", "15:00", "15:04", "23:00", "23:59"}));
    }
}

class Solution {
    public String solution(String[] arr){
        int time = 0;
        for (int i = 0; i < arr.length; i += 2){
            int hour = Integer.parseInt(arr[i+1].substring(0, 2)) - Integer.parseInt(arr[i].substring(0, 2));
            int min = (60 * hour + Integer.parseInt(arr[i+1].substring(3))) - Integer.parseInt(arr[i].substring(3));
            if (min > 105) time += 105;
            else if (min >= 5) time += min;
        }

        return "%02d:%d".formatted(time/60, time%60);
    }
}