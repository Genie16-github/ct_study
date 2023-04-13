package study.ll.Section5.Test1;

import java.util.ArrayList;
import java.util.Collections;

// 결혼식
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[][]{{14, 18}, {12, 15}, {15, 20}, {20, 30}, {5, 14}}));
    }
}

class Solution {
    public int solution(int[][] times) {
        ArrayList<Time> arr = new ArrayList<>();
        for (int[] tmp : times){
            arr.add(new Time(tmp[0], 's'));
            arr.add(new Time(tmp[1], 'e'));
        }
        int ans = 0; // 가장 작은 수를 넣어주고
        Collections.sort(arr); // 배열리스트를 오름차순으로 정렬
        int cnt = 0;
        for (Time time : arr) {
            if (time.state == 's') cnt++; // 들어오면 +
            else cnt--; // 나가면 -
            ans = Math.max(ans, cnt); // 변화가 있을 때마다 Max 값 갱신
        }
        return ans;
    }
}

class Time implements Comparable<Time>{
    public int time;
    public char state;

    Time(int time, char state){
        this.time = time;
        this.state = state;
    }

    @Override
    public int compareTo(Time ob) { // 시간을 오름차순으로 정렬하고 시간이 같을시 가는 시간 우선으로 정렬
        if (this.time == ob.time) return this.state - ob.state; // 동시에 오고 간다하면 카운트를 안하기 때문
        else return this.time - ob.time;
    }
}