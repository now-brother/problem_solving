package java.programmers.level1.로또의최고순위와최저순위;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zeroN = 0;
        int O = 0;
        
        for(int i : lottos){
            if(i == 0){
                zeroN++;
                continue;
            }
            for(int j : win_nums){
                if(i == j){
                    O++;
                    break;
                }
            }
        }
        int best = O + zeroN;
        answer[0] = best > 1 ? 6 - best + 1 : 6;
        answer[1] = O > 0 ? 6 - O + 1 : 6;
        
        return answer;
    }
}