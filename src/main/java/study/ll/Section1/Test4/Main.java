package study.ll.Section1.Test4;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("abcabbakcba" ));
    }
}

class Solution {
    public String solution(String s) {
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != s.charAt(s.length()-1-i)){
                if(!isPalindrome(s.substring(i, s.length()-i))){
                    return "NO";
                }
                break;
            }
        }
        return "YES";
    }

    public boolean isPalindrome(String str){
        if(str.length() == 2) return true;
        String tmp = str.substring(1);
        if(tmp.equals(new StringBuffer(tmp).reverse().toString())) return true;

        str = str.substring(0, str.length()-1);
        return str.equals(new StringBuffer(str).reverse().toString());
    }
}

