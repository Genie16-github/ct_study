package study.ll.Section1.Test3;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("a#b!GE*T@S"));
    }
}

class Solution {
    public String solution(String s) {
        char[] c = s.toCharArray();
        int lt = 0;
        int rt = s.length()-1;
        while(lt < rt){         // 투 포인터
            if(!Character.isAlphabetic(c[lt])) lt++;  // 왼쪽부터 알파벳인지 확인, 아니면 pass
            else if(!Character.isAlphabetic(c[rt])) rt--;  // 오른쪽 확인하고, 아니면 pass
            else{   // 둘다 알파벳인 경우 swap
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;
                rt--;
            }
        }
        return String.valueOf(c);
    }
}
