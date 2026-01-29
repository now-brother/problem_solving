package java.programmers.카펫;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int n = brown + yellow;
        
        for(int i = 1; i <= n/2; i++){
            if(n % i == 0){
                int w = i;
                int h = n / i;
                if((w - 2) * (h - 2) == yellow){
                    answer[0] = h;
                    answer[1] = w;
                    break;
                }
            }
        }
        
        return answer;
    }
}