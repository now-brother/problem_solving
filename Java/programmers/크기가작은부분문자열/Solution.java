package java.programmers.크기가작은부분문자열;

public class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        int lent = t.length();
        int lenp = p.length();
        long intp = Long.parseLong(p);

        for(int i = 0; i < lent - lenp + 1; i++){
            String test = t.substring(i, i+lenp);
            long intt = Long.parseLong(test);
            if(intt <= intp)
                answer++;
        }
        
        return answer;
    }
}
    