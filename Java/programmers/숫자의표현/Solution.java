package Java.programmers.숫자의표현;

class Solution {
    public int solution(int n) {
        int answer = 1;
        
        for(int i = 1; i < n/2 + 1; i++){
            if(math(i, 0, n) == n){
                answer++;
            }
        }
        
        return answer;
    }
    
    private int math(int i, int temp, int n){
        int p = 0;
        p = temp + i;
        if(p > n){
            return 0;
        }else if(p == n){
            return n;
        }else{
            return math(i + 1, p, n);
        }
    }
}