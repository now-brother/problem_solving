package java.programmers.자릿수더하기;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String s = Integer.toString(n);
        
        for(int i = 0; i < s.length(); i++){
            answer += s.charAt(i) - '0';
        }

        return answer;
    }
}