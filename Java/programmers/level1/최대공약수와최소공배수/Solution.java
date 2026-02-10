package java.programmers.level1.최대공약수와최소공배수;

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        for(int i = m; i > 0; i--){
            if(m % i == 0 && n % i == 0){
                answer[0] = i;
                break;
            }
        }
        
        int temp = m;
        
        while(true){
            if(temp % n == 0 && temp % m == 0){
                answer[1] = temp;
                break;
            }
            
            temp++;
        }
        
        return answer;
    }
}