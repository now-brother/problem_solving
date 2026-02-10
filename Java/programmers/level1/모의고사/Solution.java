package java.programmers.level1.모의고사;

import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        ArrayList<Integer> ans = new ArrayList<>();        
        int[] answerCount = {0,0,0};
        int[][] answerp = {
                            {1,2,3,4,5},
                            {2,1,2,3,2,4,2,5},
                            {3,3,1,1,2,2,4,4,5,5}
                        };
        
        for(int k = 0; k < 3; k++){
            for(int i = 0; i < answers.length;i++){
                if(answers[i] == answerp[k][i % answerp[k].length]){
                    answerCount[k] += 1;
                }
            }
        }
                
        int maxScore = Math.max(answerCount[0], Math.max(answerCount[1], answerCount[2]));
        for (int i = 0; i < 3; i++) {
            if (answerCount[i] == maxScore) {
                ans.add(i + 1);
            }
        }
        
        return ans.stream().mapToInt(i -> i).toArray();
    }
}
