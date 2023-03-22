package study.ll.section2.Test8;

// 봉우리
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[][]{{5, 3, 7, 2, 3},
                {3, 7, 1, 6, 1}, {7, 2, 5, 3, 4}, {4, 3, 6, 4, 1}, {8, 7, 3, 5, 2}}));
    }
}

class Solution {
    public int solution(int[][] board) {
        int[] dx = {0, 0, -1, 1};
        int[] dy = {1, -1, 0, 0};
        int cnt = 0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                boolean chk = true;
                // System.out.println("board[i][j] : " + board[i][j] + ", i, j : " + i + ", " + j);
                for (int d = 0; d < 4; d++) {
                    int nx = i + dx[d];
                    int ny = j + dy[d];
                    if (0 <= nx && nx < board.length && 0 <= ny && ny < board.length) {
                        if (board[i][j] <= board[nx][ny]) {
                            chk = false;
                            break;
                        }
                    }
                }
                if (chk) cnt++;
            }
        }
        return cnt;
    }
}