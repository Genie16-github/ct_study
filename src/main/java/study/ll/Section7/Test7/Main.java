package study.ll.Section7.Test7;

// 줄다리기

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(
                new int[][]{{1, 3}, {5, 7}, {4, 2}}));
    }
}

class Solution {
    int N = 7;
    int[] permutation = new int[N + 1];
    boolean[] visited = new boolean[N + 1];
    int[][] fight;
    int cnt = 0;

    public int solution(int[][] data) {
        fight = data;
        dfs(1);
        return cnt;
    }

    void dfs(int depth) {
        if(depth == N+1) { // 7명을 일렬로 세운 경우
            for(int i=1; i<=N; i++) {
                for (int[] f : fight) {  // 서로 싫어하는 사람들이 붙어있는지 확인
                    if (permutation[i-1] == f[0] && permutation[i] == f[1] ||
                            permutation[i-1] == f[1] && permutation[i] == f[0]) {
                        return;  // 붙어있다면 바로 리턴
                    }
                }
            }
            cnt++;
            return;
        }

        for(int i=1; i<=N; i++) {
            if(!visited[i]) { // 아직 방문X
                visited[i] = true; // 방문 표시
                permutation[depth] = i; // 숫자 저장
                dfs(depth+1); // 다음 자리 탐색
                visited[i] = false; // 방문 표시 해제
            }
        }
    }
}