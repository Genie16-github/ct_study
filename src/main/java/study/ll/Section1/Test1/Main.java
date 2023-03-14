package study.ll.Section1.Test1;

public class Main {
    public String solution(String s){
        StringBuilder answer= new StringBuilder();
        s += " ";
        char start = s.charAt(0);
        int cnt = 1;
        for (int i = 1; i < s.length(); i++){
            if(start == s.charAt(i)) cnt++;
            else{
                answer.append(start);
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
