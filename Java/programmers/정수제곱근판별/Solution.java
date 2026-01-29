package java.programmers.정수제곱근판별;

class Solution {
    public long solution(long n) {
        long answer = 1;
        
        while(true){
            long temp = answer * answer;
            
            if(temp == n){
                answer = (answer + 1) * (answer + 1);
                break;
            }
            
            if(temp > n){
                answer = -1;
                break;
            }
            
            answer++;
        }
        
        return answer;
    }
}