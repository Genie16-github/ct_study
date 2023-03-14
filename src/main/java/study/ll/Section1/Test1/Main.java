package study.ll.Section1.Test1;

public class Main {
    public String solution(String s){
        StringBuilder answer = new StringBuilder();
        s += " ";  // 끝까지 탐색
        char start = s.charAt(0);
        int cnt = 1;
        for (int i = 1; i < s.length(); i++){
            if(start == s.charAt(i)) cnt++;  // 다음 문자랑 비교하면서 같으면 cnt 계속 증가
            else{
                answer.append(start);        // 다를 경우 cnt 추가하고 start에 다음 문자 삽입
                if(cnt > 1) answer.append(cnt);
                cnt = 1;
                start = s.charAt(i);
            }
        }

        return answer.toString();
    }

    public static void main(String[] args){
        Main T = new Main();
        System.out.println(T.solution("AAABCCCDD"));
    }
}
