package study.ll.Section1.Test11;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new String[]{"00:12","00:00", "01:05", "00:57"}));
    }
}

class Solution {
    public int solution(String[] times){
        int minTime = 24 * 60;
        for(int i = 0; i < times.length; i++){
            for(int j = i+1; j < times.length; j++){
                int hour = Integer.parseInt(times[j].substring(0, 2))
                        - Integer.parseInt(times[i].substring(0, 2));
                if (Math.abs(hour) > 12)
                    if (hour > 0) hour = 24 - hour;
                    else hour = -24 - hour;
                int min = Math.abs(Integer.parseInt(times[j].substring(3))
                        - Integer.parseInt(times[i].substring(3)));
                if (Math.abs(hour * 60 + min) < minTime) minTime = Math.abs(hour * 60 + min);
            }
        }
        return minTime;
    }
}