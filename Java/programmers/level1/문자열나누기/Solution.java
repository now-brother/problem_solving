package java.programmers.level1.문자열나누기;

class Solution {
    public int solution(String s) {
        int answer = 0;
        int same = 0, diff = 0;
        char first = s.charAt(0);

        for (int i = 0; i < s.length(); i++) {
            if (same == 0) {
                first = s.charAt(i);
            }

            if (s.charAt(i) == first) same++;
            else diff++;

            if (same == diff) {
                answer++;
                same = 0;
                diff = 0;
            }
        }

        if (same != 0 || diff != 0) answer++;

        return answer;
    }
}

