package java.programmers.덧칠하기;

class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        
        int[] wall = new int[n];
        
        for(int i : section){
            wall[i - 1] = 1;
        }
        
        for(int i = 0; i < n - m; i++){
            if(wall[i] == 1){
                for(int j = i; j < i + m; j++){
                    wall[j] = 0;
                }
                answer++;
            }
        }
        
        for(int i = n - m; i < n; i++){
            if(wall[i] == 1){
                answer++;
                break;
            }
        }
        
        return answer;
    }
}
